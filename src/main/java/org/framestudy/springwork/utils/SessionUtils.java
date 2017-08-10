package org.framestudy.springwork.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * Session连接工具类
 * @author Administrator
 *
 */
public class SessionUtils {

	private static SqlSessionFactory sf;
	private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>(){
		protected SqlSession initialValue() {
			return sf.openSession();
		};
	};
	
	
	static{
		
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("mybatis.cfg.xml");
			sf = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
/*		SqlSession session = local.get();*/
/*		if(session != null){
			return session;
		}else{*/
		SqlSession session = sf.openSession();
/*			local.set(session);
		}*/
		return session;
	}
}
