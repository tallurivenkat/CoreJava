package com.venkat.corejava;
/**
 * @author talluri
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTest {
	
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		Employee e=new Employee();
		e.setName("Venkat");
		list.add(e);
		Employee e1=new Employee();
		e1.setName("Naresh");
		list.add(e1);
		Employee e2=new Employee();
		e2.setName("Shanthi");
		list.add(e2);
		Employee e3=new Employee();
		e3.setName("Jessica");
		list.add(e3);
		Employee e4=new Employee();
		e4.setName("Prasad");
		list.add(e4);
		Employee e5=new Employee();
		e5.setName("Rama");
		list.add(e5);
		Employee e6=new Employee();
		e6.setName("Talluri");
		list.add(e6);
		System.out.println("--------------------------------");
	for (Employee employee : list) {
		
		System.out.println(employee.getName());
	}
	System.out.println("--------------------------------");
	Collections.sort(list, new Comparator<Employee>() {
		
		public int compare(Employee v1, Employee v2) {
	        return v1.getName().compareTo(v2.getName());
	    }
	});
	
for (Employee employee : list) {
		
		System.out.println(employee.getName());
	}
	
	}
	
}
