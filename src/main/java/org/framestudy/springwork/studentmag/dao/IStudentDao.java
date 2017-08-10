package org.framestudy.springwork.studentmag.dao;

import org.framestudy.springwork.beans.StudentInfo;

public interface IStudentDao {
	public void addStudentInfo(StudentInfo stu);
	
	public void updateStudentInfo(StudentInfo stu);

	public void deleteStudentInfoById(long id);
	
	public StudentInfo getStudentInfoById(long id);
}
