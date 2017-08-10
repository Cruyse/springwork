package org.framestudy.springwork.classmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.framestudy.springwork.beans.ClassInfo;


public interface ClassMapper {
	public void addClassInfo(@Param("cla")ClassInfo cla);
	
	public void updateClassInfo(@Param("cla")ClassInfo cla);

	public void deleteClassInfoById(long id);
	
	public ClassInfo getClassInfoById(long id);
}
