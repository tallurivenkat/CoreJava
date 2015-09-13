package com.venkat.corejava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserilizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("persons.dat"));
			Person[] array=(Person[])in.readObject();
			in.close();
			System.out.println("Reading from Serialization");
			System.out.println("Deserilized object "+array[0].getName() +" second Object "+array[1].getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
