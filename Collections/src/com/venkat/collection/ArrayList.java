package com.venkat.collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l= new java.util.ArrayList();
		
		for ( int i=0; i<=10; i++){
			l.add(new Integer(i));
			
		}
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Integer k=(Integer) itr.next();
			
		}
	}

}
