package com.KodNest.OOPS.Inheritance1;

public class RobotApp 
{
	public static void main(String[] args) 
	{
		ChefRobot cr=new ChefRobot();
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cook();
		DoctorRobot dr=new DoctorRobot();
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();
		TeacherRobot tr=new TeacherRobot();
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
	}
}
