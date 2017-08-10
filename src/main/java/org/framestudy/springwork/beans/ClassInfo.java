package org.framestudy.springwork.beans;

import java.io.Serializable;

public class ClassInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 338117426695000543L;
	
	private long id;
	private String name;


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

	@Override
	public String toString() {
		return "ClassInfo [id=" + id + ", name=" + name + "]";
	}


	
	

}
