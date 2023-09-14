package com.svit.daysix;

@SuppressWarnings("serial")

public class Test extends Student {
public static void main(String args[])
    {
        Student s = new Student(); // object is created
        s.setId(1);
        System.out.println(s.getId());
        s.setName("GFG"); // setting value to the object
        System.out.println(s.getName());
    }
}