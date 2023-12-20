package com.KodNest.Compositon;

public class Page 
{
	String content;
	Page(String content)
	{
		this.content=content;
	}
	void writeContent()
	{
		System.out.println("Writing content "+content+" on page");
	}
}
