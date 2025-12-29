package Day_16_11_2025;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char Ans;
	

	System.out.println("Enter the Number");
	 int number = sc.nextInt();
	 int origin = number;
	 int stored =0;
	 
	 while(0<number) {	 
		 int digit = number%10;
		 stored = stored +(digit*digit*digit);
		 number/= 10;
	 }
	 //System.out.println(origin);
	  if(origin==stored){
			System.out.println("ArmStrong Number");
	  }
	  else {
		  System.out.println("Not ArmStrong Number");
	  }
	  
//	  System.out.println("Check Again insert(y/n)");
//	   Ans =sc.next().charAt(0);	
	}

}	
	
	
	 //stored the number in a variable 
	 // get the last number
	 // num*num*num	
	 // delete the last number
	 
	 

