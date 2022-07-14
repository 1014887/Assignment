package com.yash.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.model.Student;

public class StudentTest
{
	public static void main(String[] args)
	{
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student objS = (Student) objAC.getBean("studbean");
		System.out.println("Using dependency injection by Setter : ");
		System.out.println("Name : "+objS.getName());
		System.out.println("Address : "+objS.getAddress());
		
		
		Student objC = (Student) objAC.getBean("studbeanc");
		System.out.println();
		System.out.println("Using dependency injection by Constructor :");
		objC.show();
	}
}
