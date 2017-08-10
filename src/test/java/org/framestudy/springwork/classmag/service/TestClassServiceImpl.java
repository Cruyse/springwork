package org.framestudy.springwork.classmag.service;

import org.framestudy.springwork.beans.ClassInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassServiceImpl {

	private ApplicationContext ac;
	private IClassService classServiceImpl;
	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//得到容器内容实例化对象的名称数组
		classServiceImpl =(IClassService) ac.getBean("classServiceImpl");
	}
	
	@Test
	public void addClassInfo() {
		ClassInfo classBean = new ClassInfo();
		classBean.setName("j145");
		classServiceImpl.addClassInfo(classBean);
	}

}
