package org.gth;
import java.util.*;
class StudDetails1
{
    private int id;
    private String name;
    private String email;
    private int fee;
    private int duration;
    
    public void setId(int id)
    {    this.id=id;
    }
    public int getId()
    {   return id;
    }
    public void setName(String name)
    {   this.name=name;
    }
    public String getName()
    {  return name;
    }
    public void setEmail(String email)
    {  this.email=email;
    }
    public String getEmail()
    {   return email;
    }
    public void setFee(int fee)
    {   this.fee=fee;
    }
    public int getFee()
    {    return fee;
    }
    public void setDuration(int duration)
    {   this.duration=duration;
    }
}
class LoginEncap
{
	private StudDetails1 s;
	public void checkValid(String email , String name)
	{
		if(email.equalsIgnoreCase("rahul.com") && name.equalsIgnoreCase("Rahul"))
		{
			s=new StudDetails1();
			s.setId(1);
			s.setName("Rahul");
			s.setEmail("rahul.com");
			s.setFee(34000);
			s.setDuration(3);
			showData(s);
	     }
		else
		{
			System.out.println("You are not user ");
		}
     }
	public void showData(StudDetails1 s)
	{
		System.out.println("Registered use");
	}
}
public class StudentIncapsulation {
	public static void main(String[] args) {
		
		LoginEncap le=new LoginEncap();
		le.checkValid("rahul.com" , "ahul");

	}
}
