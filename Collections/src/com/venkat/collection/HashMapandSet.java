/**
 * 
 */
package com.venkat.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author talluri
 *
 */
public class HashMapandSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> phone=new HashSet<Integer>();
		
		phone.add(21789978);
		phone.add(21789979);
		phone.add(21789980);
		phone.add(null);
		System.out.println(phone);
		
		System.out.println("*******************************************");
		HashMap<String, Integer> directory=new HashMap<String, Integer>();
		directory.put("venkat", 217899);
		directory.put("naresh", 983344);
		directory.put(null, 983344);
		directory.put(null, null);
		
		System.out.println(directory);
		System.out.println(directory.get("venkat"));
		
		System.out.println("*******************************************");
		Hashtable<String, Integer> directory1=new Hashtable<String, Integer>();
		directory1.put("venkat", 217899);
		directory1.put("naresh", 687687);
		directory1.put("naresh", 217888);
		//directory1.put(null, 983344);
		System.out.println(directory1);
		System.out.println(directory1.get("venkat"));
		
		
	}

}
