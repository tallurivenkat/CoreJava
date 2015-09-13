/**
 * 
 */
package com.venkat.corejava;

/**
 * @author talluri
 *
 */
public class CloneTest implements Cloneable {

	/**
	 * @param args
	 */
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{CloneTest ct=new CloneTest();
		ct.setName("Venkat");
		CloneTest	cloneObj=(CloneTest) ct.clone();
		System.out.println("Clone Object "+cloneObj.getName());
		}
		catch(CloneNotSupportedException e) 
		{
		e.printStackTrace();
		throw new RuntimeException();
		}
	
		
	}

}
