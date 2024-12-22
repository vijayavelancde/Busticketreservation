package PROJECT;

import java.util.Scanner;

public class Admin {

		static String PIN = "Admin Panel";
		static String user_name = "Admin";
	    static String password = "admin123";
	    
	    Admin(String user, String password,String PIN){
	    	user_name = user;
	    	this.password = password;
	    	this.PIN = PIN;
	    }
	    
	  
		static boolean validation(String username, String passcode) {
			if(user_name.equals(username) && password.equals(passcode)) {
				System.out.println("Logged in successfully");
				return true;
			}
			else {
				System.out.println("incorrect credentials");
				return false;
			}
		}
	
		
}


