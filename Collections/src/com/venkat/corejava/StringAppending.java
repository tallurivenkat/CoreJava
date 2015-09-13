/**
 * 
 */
package com.venkat.corejava;

/**
 * @author talluri
 *
 */
public class StringAppending {

	/**
	 *  array= {a,b,c}, '#'
	 *  output a#b#c#
	 */
	public String appendData(char[] data,String delimiter){
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			
			sb.append(data[i]);
			sb.append(delimiter);
		}
		
	return sb.toString();	
	}
	
	public static void main(String[] args) {
		
		char[] data = {'A','B','C'};//store data
		
		String delimiter="#";
		
		StringAppending sa=new StringAppending();
		String resultdata=sa.appendData(data, delimiter);
		System.out.println(resultdata);

	}

}
