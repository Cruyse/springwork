package org.framestudy.springwork.studentmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.framestudy.springwork.beans.StudentInfo;


public interface StudentMapper {
	
	public void addStudentInfo(@Param("stu")StudentInfo stu);
	
	public void updateStudentInfo(@Param("stu")StudentInfo stu);

	public void deleteStudentInfoById(long id);
	
	public StudentInfo getStudentInfoById(long id);

}
