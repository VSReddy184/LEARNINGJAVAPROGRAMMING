package com.KodNest.OOPS.InheritanceCC.This;

public class Developer 
{
	String projectName;
	String tech;
	public Developer()
	{
		this("Facebook");
	}
	public Developer(String projectName)
	{
		this("Instagram","JavaTech");
		this.projectName=projectName;
	}
	public Developer(String projectName,String tech)
	{
		super();
		this.projectName=projectName;
		this.tech=tech;
	}
}
