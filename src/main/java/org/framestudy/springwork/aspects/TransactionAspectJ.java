package org.framestudy.springwork.aspects;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.framestudy.springwork.studentmag.mapper.StudentMapper;
import org.framestudy.springwork.utils.SessionUtils;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspectJ {
	
	private SqlSession session;
	
	@Before(value="execution(* org.framestudy.springwork.*mag.dao.impl.*DaoImpl.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		session = SessionUtils.getSession();
		Object obj = jp.getTarget();
		Class<?> cls = obj.getClass();
		try {
			Method method = cls.getMethod("setSession",SqlSession.class);
			method.invoke(obj,this.session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@AfterReturning(pointcut="execution(* org.framestudy.springwork.*mag.dao.impl.*DaoImpl.*(..))",returning="rev")
	public void afterReturningAdvice(JoinPoint jp,Object rev) {
		this.session.commit();
	/*	this.session.close();*/
	} 
	
	@AfterThrowing(pointcut="execution(* org.framestudy.springwork.*mag.dao.impl.*DaoImpl.*(..))",throwing="th")
	public void afterThrowingAdvice(JoinPoint jp,Throwable th) {
		this.session.rollback();
		System.out.println(th);
		this.session.close();
		
		
	}

}
