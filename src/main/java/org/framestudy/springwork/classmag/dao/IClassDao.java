package org.framestudy.springwork.classmag.dao;

import org.apache.ibatis.annotations.Param;
import org.framestudy.springwork.beans.ClassInfo;


public interface IClassDao {

	public void addClassInfo(ClassInfo cla);
	
	public void updateClassInfo(ClassInfo cla);

	public void deleteClassInfoById(long id);
	
	public ClassInfo getClassInfoById(long id);
}
