package com.yash.model;

public class Student 
{
	private String name;
	private String address;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public Student(String name)
	{
		super();
		this.name = name;
	}
	public Student(String name, String address) 
	{
		super();
		this.name = name;
		this.address = address;
	}
	public Student() 
	{
		super();
	}	
	public void show()
	{
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}