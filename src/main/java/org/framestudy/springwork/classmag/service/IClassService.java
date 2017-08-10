package org.framestudy.springwork.classmag.service;

import org.apache.ibatis.annotations.Param;
import org.framestudy.springwork.beans.ClassInfo;


public interface IClassService {
	
	public void addClassInfo(ClassInfo cla);
	
	public void updateClassInfo(ClassInfo cla);

	public void deleteClassInfoById(long id);
	
	public ClassInfo getClassInfoById(long id);
}
