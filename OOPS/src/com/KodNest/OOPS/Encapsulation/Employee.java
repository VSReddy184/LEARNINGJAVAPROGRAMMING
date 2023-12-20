package com.KodNest.OOPS.Encapsulation;

public class Employee 
{
	private int empId;
	private String name;
	private float salary;
	public Employee(int empId,String name,float salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getName()
	{
		return name;
	}
	public float getSalary()
	{
		return salary;
	}
}
