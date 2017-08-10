package org.framestudy.springwork.classmag.service.impl;

import org.framestudy.springwork.beans.ClassInfo;
import org.framestudy.springwork.classmag.dao.IClassDao;
import org.framestudy.springwork.classmag.service.IClassService;

public class ClassServiceImpl implements IClassService {
	
	private IClassDao classDaoImpl;

	public void setClassDaoImpl(IClassDao classDaoImpl) {
		this.classDaoImpl = classDaoImpl;
	}

	public void addClassInfo(ClassInfo cla) {
		// TODO Auto-generated method stub
		classDaoImpl.addClassInfo(cla);
	}

	public void updateClassInfo(ClassInfo cla) {
		// TODO Auto-generated method stub
		classDaoImpl.updateClassInfo(cla);
	}

	public void deleteClassInfoById(long id) {
		// TODO Auto-generated method stub
		classDaoImpl.deleteClassInfoById(id);
	}

	public ClassInfo getClassInfoById(long id) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassInfoById(id);
	}

}
