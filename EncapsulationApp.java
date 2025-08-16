package org.gth;
import java.util.*;
class Schedule
{
	private int id;
	private String examName;
	private String date;
	private int totalMarks;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setExamName(String name)
	{
		this.examName=name;
	}
	public String getName()
	{
		return examName;
	}
	public void setDate(String date)
	{
		this.date=date;
	}
	public String getDate()
	{
		return date;
	}
	public void setMarks(int marks)
	{
		this.totalMarks=marks;
	}
	public int getMarks()
	{
	     return totalMarks;
	}
}
class showSchedule
{
	private Schedule sh;
	public void verifyUser(String name , String pass)
	{
		if(name.equals("abc") && pass.equals("mno"))
		{
			sh=new Schedule();
			sh.setId(1);
			sh.setExamName("BBACA");
			sh.setDate("16/08/2025");
			sh.setMarks(100);
			show(sh);
			
		}
		else
		{
			System.out.println("invalid user :");
		}
	}
	private void show(Schedule sh)
	{
		System.out.println(sh.getId() + "\t"+sh.getName() +"\t"+sh.getDate()+"\t"+sh.getMarks());
	}
	
}
public class EncapsulationApp {

	public static void main(String[] args) {
		showSchedule ss=new showSchedule();
		ss.verifyUser("abc", "mno");

	}

}
