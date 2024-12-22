package PROJECT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Userdata {
	
//	String Ticket_ID;
	private String name;
	private String From;
	private String To;
	private int number_of_tickets;
	private int age;
	private String Gender;
	private String date;
	
	
	
	Userdata(String name,int age,String From,String To,String Gender,int number_of_tickets,String date1){
		this.name = name;
		this.age = age;
		this.From = From;
		this.To = To;
		this.Gender = Gender;
		this.number_of_tickets = number_of_tickets;
		this.date = date1;
	}
	
	String getname() {
		return name;
	}
	
	int getage() {
		return age;
	}
	
	String getfrom() {
		return From;
	}
	
	String getto() {
		return To;
	}
	
	String getGender() {
		return Gender;
	}
	
	String getdate() {
		return date;
	}
	
	int getticketno() {
		return number_of_tickets;
	}
	
	void display(){
		System.out.println("User Name : "+ name+" "+"Age: "+" "+age+" "+"From: "+From+" "+"To: "+To+" "+"Gender: "+Gender+" "+"Travel date: "+date +" "+ "Tickets Number: "+number_of_tickets);
	}
	
	

	  

	}

		

	
	
	
	


