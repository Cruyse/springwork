package org.framestudy.springwork.studentmag.service;

import javax.annotation.Resource;

import org.framestudy.springwork.beans.ClassInfo;
import org.framestudy.springwork.beans.StudentInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestStudentServiceImpl {
	
/*	private ApplicationContext ac;
	private IStudentService studentServiceImpl;
	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//得到容器内容实例化对象的名称数组
		studentServiceImpl =(IStudentService) ac.getBean("studentServiceImpl");
	}*/
	
	@Resource
	private IStudentService studentServiceImpl;
	
	@Ignore
	public void deleteStudentInfo() {
		StudentInfo stu = studentServiceImpl.getStudentInfoById(2l);
		Assert.assertNotNull(stu);
		studentServiceImpl.deleteStudentInfoById(2l);
	}
	
	@Ignore
	public void updateStudentInfo() {
		StudentInfo stu = studentServiceImpl.getStudentInfoById(1l);
		Assert.assertNotNull(stu);
		stu.setName("小红");
		studentServiceImpl.updateStudentInfo(stu);
	}
	
	@Test
	public void addStudentInfo() {
		StudentInfo stu = new StudentInfo();
//		stu.setName("小红");
//		stu.setGender("女");
//		stu.setBirthday("2017-09-08");
//		ClassInfo classBean = new ClassInfo();
//		classBean.setId(1);
//		stu.setClassBean(classBean);
//		studentServiceImpl.addStudentInfo(stu);
		
		stu = studentServiceImpl.getStudentInfoById(1l);
		System.out.println(stu);
		Assert.assertNotNull(stu);
		stu.setName("小王");
		stu.setId(1l);
		studentServiceImpl.updateStudentInfo(stu);
	}

}
