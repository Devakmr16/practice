package org.coll;

import java.util.Scanner;

public class Results {

	private void devak() 
{
System.out.println("dd");
}

	private void deva() 
{
		System.out.println("deva");

	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter student id");
	int id = s.nextInt();
	System.out.println("id is "+id);
	System.out.println("enter student name");
	String name = s.next();
	System.out.println("name is "+name);
	System.out.println("enter mark1");
	short mark1 = s.nextShort();
	System.out.println("mark1 is "+mark1);
	System.out.println("enter mark2");
	short mark2 = s.nextShort();
	System.out.println("mark2 is "+mark2);
	System.out.println("enter mark3");
	short mark3 = s.nextShort();
	System.out.println("mark3 is "+mark3);
	System.out.println("enter mark4");
	short mark4 = s.nextShort();
	System.out.println("mark4 is "+mark4);
	System.out.println("enter mark5");
	short mark5 = s.nextShort();
	System.out.println("mark5 is "+mark5);
	int total = mark1+mark2+mark3+mark4+mark5;
	System.out.println("your total mark is "+total);
	int average = (mark1+mark2+mark3+mark4+mark5)/5;
	System.out.println("your averagae mark is "+average);
	
	
	
	
	
}
}
