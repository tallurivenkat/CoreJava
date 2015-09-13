package com.venkat.corejava;

import java.io.Serializable;

public class Person implements Serializable {

	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3041211881223261050L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
