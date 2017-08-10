package org.framestudy.springwork.studentmag.service.impl;


import javax.annotation.Resource;

import org.framestudy.springwork.beans.StudentInfo;
import org.framestudy.springwork.studentmag.dao.IStudentDao;
import org.framestudy.springwork.studentmag.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Resource
	private IStudentDao studentDaoImpl;

	public void addStudentInfo(StudentInfo stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.addStudentInfo(stu);
	}

	public void updateStudentInfo(StudentInfo stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.updateStudentInfo(stu);
	}

	public void deleteStudentInfoById(long id) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStudentInfoById(id);
	}

	public StudentInfo getStudentInfoById(long id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStudentInfoById(id);
	}

}
