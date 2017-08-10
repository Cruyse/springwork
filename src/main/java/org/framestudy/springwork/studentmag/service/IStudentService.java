package org.framestudy.springwork.studentmag.service;

import org.framestudy.springwork.beans.StudentInfo;

public interface IStudentService {
	public void addStudentInfo(StudentInfo stu);
	
	public void updateStudentInfo(StudentInfo stu);

	public void deleteStudentInfoById(long id);
	
	public StudentInfo getStudentInfoById(long id);
}
