package com.KodNest.Compositon;

class BookApp 
{
	public static void main(String[] args) 
	{
		Book bk=new Book("KodNest");
		bk.readBook();
		bk.p.writeContent();
		//bk=null;
		//bk.readBook();
		//bk.p.writeContent(); ERROR
	}
}
