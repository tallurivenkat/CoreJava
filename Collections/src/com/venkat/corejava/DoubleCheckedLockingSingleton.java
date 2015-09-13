package com.venkat.corejava;

public class DoubleCheckedLockingSingleton {
	private volatile DoubleCheckedLockingSingleton INSTANCE;
	
	private DoubleCheckedLockingSingleton(){}
	
	public DoubleCheckedLockingSingleton getInstance(){
		if(INSTANCE==null){
			synchronized(DoubleCheckedLockingSingleton.class){
				if(INSTANCE==null){
					INSTANCE=new DoubleCheckedLockingSingleton();
				}
			}
		}
		return INSTANCE;
		
	}
}
