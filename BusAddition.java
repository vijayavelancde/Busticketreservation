package PROJECT;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import PROJECT.Bus.Location;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class BusAddition {
    private int bus_no;
    private String from;
    private String to;
    private boolean ac;
    private int capacity;
    private boolean sleeper;
    private String date;
    // Constructor
    BusAddition(int busno, int capacity, boolean ac, boolean sleeper, String from, String to, String date) {
        this.bus_no = busno;
        this.ac = ac;
        this.capacity = capacity;
        this.sleeper = sleeper;
        this.from = from;
        this.to = to;
        this.date = date;
    }	  
    
    
  
    
 public int getbusno(){
	  return bus_no;
  }
  
  public boolean getac() {
	  return ac;
  }
  
  public boolean getsleeper() {
	  return sleeper;
  }
  
 public int capacity() {
	  return capacity;
  }
 
 public String from() {
	 return from;
	 
 }
 
 public String to() {
	 return to;
 }
 
 public String date() {
	 return date;
 }
 

 

 public static boolean displayBusDetails(ArrayList<BusAddition> bus, ArrayList<Userdata> users, ArrayList<BusAddition> matchedbuses ){
	
	 for(BusAddition b:bus) {
		 for(Userdata u:users) {
		 if(b.from.trim().equalsIgnoreCase(u.getfrom()) && b.to.trim().equalsIgnoreCase(u.getto()) && b.date.trim().equalsIgnoreCase(u.getdate())) {
			 matchedbuses.add(b);
			 return true;
		 }
	
		 }
	 }
	 return false;
	
	 
 }
 
 public void dissplaymatchedbus() {
	 System.out.println("Bus No :"+ getbusno()+" "+"From : "+ from()+" "+ "To :" +to()+" "+"Date: "+ date()+" " +"Capacity :"+ capacity() );
 }
 
 
}
   

  
  




	

