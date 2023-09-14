package com.svit.daythree;


	class Student{
	    int id;  // instance variables
	    String name; // instance variables
	}
	public class InstanceVariable {
	  public static void main(String[] args) {
	          Student obj1;
	          obj1 = new Student();
	obj1.id = 1;
	        obj1.name = "J Jeffi" ;
	       Student obj2;
	   obj2 = new Student();
	        obj2.id = 2;
	        obj2.name = "Simple Snippets";
	        System.out.println(obj1.id);
	        System.out.println(obj1.name);
	        System.out.println(obj2.id);
	        System.out.println(obj2.name);     
	    } 

	 }

