package Day_26_11_2025;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	    char choice;
		do {
	
		System.out.println("Enter the Year is leap Year:");
		int year = sc.nextInt();
		
	      if(year%100==0 && year%400==0 ||year%100!=0 && year%4==0){	    
	    		  System.out.println("Leap Year"); 
	      }
	      else {
	    	  System.err.println("Not a Leap Year");
	      }
	      System.out.println("Enter Again (y/n):");
	      choice = sc.next().charAt(0); 
	      
	      if(choice=='n'){
	    	System.err.println("Thank you For Visiting");  
	      }
		}while(choice =='y'); 
	}
	
}
// year%100==0 && year%400==0 -> leap year
// year%100!=0 && year%4==0;  -> leap year