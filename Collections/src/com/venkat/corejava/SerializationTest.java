package com.venkat.corejava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] array=new Person[2];
		array[0]=new Person("venkat");
		array[1]=new Person("jessica");
		try{
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("persons.dat"));
			out.writeObject(array);
			out.close();
			System.out.println("Serilization of person is done");
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException i){
			System.out.println(i);
		}
		
	}
	
}
