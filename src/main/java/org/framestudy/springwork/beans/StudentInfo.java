package org.framestudy.springwork.beans;

import java.io.Serializable;

public class StudentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8053522449234102011L;
	private long id;
	private String name;
	private String gender;
	private String birthday;
	private ClassInfo classBean;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public ClassInfo getClassBean() {
		return classBean;
	}
	public void setClassBean(ClassInfo classBean) {
		this.classBean = classBean;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", classBean=" + classBean + "]";
	}
	
	
	
	
	

}
