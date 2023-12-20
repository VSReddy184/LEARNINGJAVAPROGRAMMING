package com.KodNest.Aggregation;

class AirlineApp 
{
	public static void main(String[] args) 
	{
		Pilot p=new Pilot("Raju");
		p.fly();
		Airline ar=new Airline("KodAir",p);
		ar.activity();
		//ar=null;
		//ar.activity(); ERROR
		//p.fly();
	}
}
