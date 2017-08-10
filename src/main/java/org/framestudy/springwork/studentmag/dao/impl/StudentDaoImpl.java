package org.framestudy.springwork.studentmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.springwork.beans.StudentInfo;
import org.framestudy.springwork.studentmag.dao.IStudentDao;
import org.framestudy.springwork.studentmag.mapper.StudentMapper;
import org.framestudy.springwork.utils.SessionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	private StudentMapper sm;
	
	public void setSession(SqlSession session) {
		sm = session.getMapper(StudentMapper.class);
	}

	public void addStudentInfo(StudentInfo stu) {
		// TODO Auto-generated method stub
			sm.addStudentInfo(stu);

	}

	public void updateStudentInfo(StudentInfo stu) {
		// TODO Auto-generated method stub
			sm.updateStudentInfo(stu);
	}

	public void deleteStudentInfoById(long id) {
		// TODO Auto-generated method stub
		sm.deleteStudentInfoById(id);;
	}

	public StudentInfo getStudentInfoById(long id) {
		// TODO Auto-generated method stub
		 return sm.getStudentInfoById(id);
	}

}
