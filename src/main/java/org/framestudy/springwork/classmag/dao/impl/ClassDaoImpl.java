package org.framestudy.springwork.classmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.springwork.beans.ClassInfo;
import org.framestudy.springwork.classmag.dao.IClassDao;
import org.framestudy.springwork.classmag.mapper.ClassMapper;
import org.framestudy.springwork.studentmag.mapper.StudentMapper;
import org.framestudy.springwork.utils.SessionUtils;


public class ClassDaoImpl implements IClassDao {
	
	private ClassMapper cm;
	
	public void setSession(SqlSession session) {
		cm = session.getMapper(ClassMapper.class);
	}
	
	public void addClassInfo(ClassInfo cla) {
		// TODO Auto-generated method stub
			cm.addClassInfo(cla);
	}

	public void updateClassInfo(ClassInfo cla) {
		// TODO Auto-generated method stub
			cm.updateClassInfo(cla);;

	}

	public void deleteClassInfoById(long id) {
		// TODO Auto-generated method stub
			cm.deleteClassInfoById(id);
	}

	public ClassInfo getClassInfoById(long id) {
		// TODO Auto-generated method stub
		return cm.getClassInfoById(id);
	}

}
