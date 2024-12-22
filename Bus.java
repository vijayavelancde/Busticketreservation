package PROJECT;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;



public class Bus extends Admin {
	
	

	Bus(String user, String password, String PIN ) {
		super(user, password, PIN );
		// TODO Auto-generated constructor stub
	}
	
	enum Location{
		CHENNAI(1), SALEM(2),BANGALORE(3), TRICHY(4), MADURAI(5),TANJORE(6), COIMBATORE(7), MMUMBAI (8), PUNE(9), DELHI(10),AGRA(11);
   
		private int i;
		Location(int i) {
			this.i = i;
		}
		
		public int getcode() {
			return i;
		}
	}

	public static void main(String[] args) {
		ArrayList<BusAddition> bus = new ArrayList<>();
		
//		  LocalDate todayDate = LocalDate.now(); // Get today's date
	      

		bus.add(new BusAddition(1, 1, true, true, "CHENNAI", "MADURAI", "21-01-2025" ));
		bus.add(new BusAddition(2, 30, false, true, "Mumbai", "Pune","22-01-2025"));
		bus.add(new BusAddition(3, 40, true, false, "Delhi", "Agra","15-11-2024"));
		
		

		ArrayList<Userdata> users = new ArrayList<Userdata>();
		ArrayList<Userdata> booked = new ArrayList<Userdata>();

		
		ArrayList<BusAddition> matchedbuses = new ArrayList<BusAddition>();
		Scanner scanner = new Scanner(System.in);
		
		
		String username = "";
		String Password = "";
		String administrator = "";
		int acc = 0;
		boolean ac = true;
		int sleeperint;
		boolean Sleeper = true;
		boolean gender = true;
		int genderint = 0;
		String Gender = "";
		int Busfrom;
		int passengerfrom;
		String PassengerFrom;
		String PassengerTo;
		int passengerto;
		String BusFrom;
		int Busto;
		String BusTo;
		String ticketno = "";
		int tickcount;
		int option = 8;
	
		
while(true) {	
	while (true) {
		    System.out.println("Enter 1 to book bus, 2 to add buses and 0 to exit:");

		    option = scanner.nextInt();
		    scanner.nextLine();

		    try {
		        // Validate input (only 0 or 1 allowed)
		        if (option == 0 || option == 1|| option == 2) 
		            break; // Valid input; exit the loop
		       
		    } catch (NumberFormatException e) {
		        // Handle non-numeric input
		    	System.out.println("Enter a valid input");
		        
		    }
	}

		
		if(option == 0) {
			System.out.println("Exiting");
			break;
		}
		
		
		
		
		else if(option == 2) {
			System.out.println("Enter the PIN to proceed:");
			String pin = scanner.nextLine();
			if(pin.equals(Admin.PIN)) {
			System.out.println("Enter the user name:");
			username = scanner.nextLine();
			System.out.println("Enter the passcode: ");
			Password = scanner.nextLine();
			if(Admin.validation(username, Password)) {
				System.out.println("Enter the bus ID:");
				 int busID = scanner.nextInt();
	  		       scanner.nextLine();
				   System.out.println("Enter the capacity");
				   int capacity = scanner.nextInt();
	  		       scanner.nextLine();
	  		       while(true) {
	  		      
	  		       System.out.println("Enter 1 if you have Airconditioner in the bus and 0 if not");
	  		       String acc1 = scanner.nextLine();
	  		       try {
	  		        acc = Integer.parseInt(acc1);
	  		    	 if (acc == 1 || acc == 0) {
	  		    		 break;
	  		    	 }
	  		    	 else {
	  		    	  System.out.println("Enter a valid input"); 
	  		    	  
	  		       } 		       
	  		       }catch(NumberFormatException e) {
	  		    	 System.out.println("Enter a valid input"); 
	  		       }
	  		       }
	  		       
	  		       if (acc == 1) {
	  		    	    ac = true; 
	  		       }
	  		       else if (acc == 0) {
	  		    	   ac = false;
	  		    	   }
	  		       
	  		       while(true) {
	  		       System.out.println("Enter 1 if the bus is a sleeper type and 0 if the it is a seater type");
	  		       String sleeperstring = scanner.nextLine();
	  		       try {
	  		    	   sleeperint = Integer.parseInt(sleeperstring);
	  		    	   if(sleeperint == 1 || sleeperint == 0) {
	  		    		   break;
	  		    	   }
	  		    	   else {
	  		    		   System.out.println("Enter a valid input");
	  		    	   }
	  		       } catch(NumberFormatException e) {
	  		    	 System.out.println("Enter a valid input");
	  		       }
	  		       
			}
	  		       if(sleeperint == 1) {
	  		    	   Sleeper = true;
	  		       }
	  		       if(sleeperint == 0) {
	  		    	   Sleeper = false;
	  		       }
	  		       
	  		       
	  		       System.out.println("The following are the locations in the application. The Numbers specified next to the locations are the location ID");
	  		       for(Location locations: Location.values()) {
	  		    	   System.out.println(locations+" - "+locations.getcode());
	  		       }
			    	  System.out.println("Enter the location ID to select the from location"); 

	  		       while (true) {
	  		    	  String fromm = scanner.nextLine();
	  		    	   try {
	  		    		   Busfrom = Integer.parseInt(fromm);
	  		    		   if(Busfrom > Location.values().length - 1) {
	  		    			   System.out.println("Invalid ID, Specify the correct ID ");
	  		    		   }
	  		    		   else {
	  		    			   break;
	  		    		   }
	  		    	   }catch(NumberFormatException e) {
	  		    		   System.out.println("Enter a valid ID");
	  		    	   }
	  		       }
	  		       
	  		       Location local = Location.values()[Busfrom-1]; 
	  		       BusFrom = local.name();
	  		       
			       for(Location locations: Location.values()) {
			    	   System.out.println(locations+" - "+locations.getcode());
			       }
			    	  System.out.println("Enter the location ID to select To location"); 

			       while (true) {
			    	  String too = scanner.nextLine();
			    	   try {
			    		   Busto = Integer.parseInt(too);
			    		   if(Busto > Location.values().length - 1 ) {
			    			   System.out.println("Invalid ID, Specify the correct ID ");
			    		   }
			    		   else if(Busto == Busfrom) {
			    			   System.out.println("Invalid, the from and to ID can't be same \n Enter a to different location ");
			    		   }
			    		   else {
			    			   break;
			    		   }
			    	   }catch(NumberFormatException e) {
			    		   System.out.println("Enter a valid ID");
			    	   }
			       }
			       
			       Location localto = Location.values()[Busto-1]; 
			       BusTo = localto.name();
			       
			       LocalDate BusTravelDate = null;
			        DateTimeFormatter BusDateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

			        while (BusTravelDate == null) {
			            System.out.println("Enter the travel date (dd-MM-yyyy):");
			            String BusdateString = scanner.nextLine();
			            try {
			                BusTravelDate = LocalDate.parse(BusdateString, BusDateformatter);
			            } catch (DateTimeParseException e) {
			                System.out.println("Invalid date format. Please try again.");
			            }
			        }

			        String BusformattedDate = BusTravelDate.format(BusDateformatter);
			        
					bus.add(new BusAddition(busID, capacity, ac, Sleeper, BusFrom, BusTo, BusformattedDate));
					
					System.out.println("Bus has been added successfullly");
					
					//scanner.nextLine();

			        
	}
		}
			else  {
				System.out.println("Wrong PIN");
			}
			
		       
		}
		
		
		
		else if(option == 1) {
       
		while(true) {	
		System.out.println("How many tickets you want to book");
		ticketno = scanner.nextLine();
		try {
		 tickcount = Integer.parseInt(ticketno);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter a valid input:");
		}
		
		}
	           
	     
	        }
		scanner.nextLine();
		if(option ==0){
			System.out.println("Exiting....");
		}
	}


	
	}
}
	        
//	        System.out.println("Enter the bus ID to book the bus:- ");
//	        int Busid = scanner.nextInt();
//	        int capacty = 0;
//	        for(BusAddition booking: matchedbuses) {
//	        	if(Busid == booking.getbusno()) {
//	        		 capacty = booking.capacity();
//	        	}
//	        		}
//	        
//	        
//	        for(Userdata uh: users) {
//	        	if(capacty >= uh.getticketno()) {
//	        		capacty -= uh.getticketno();
//	        		booked.add(uh);
//	        		System.out.println("your ticket is booked");
//	        	}
//	        	else {
//	        		System.out.println("Bus is full");
//	        	}
	        
	        
		
	        
	        
		 
		
		
		
			
		
		
	
			


