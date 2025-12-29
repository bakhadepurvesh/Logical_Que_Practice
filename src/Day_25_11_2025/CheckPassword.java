package Day_25_11_2025;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 char choice;
	do {	
      System.out.println("Please Enter The Password :");
		String password =sc.next().trim();
//		String setPassword ="";
		
		if(password.length()>=8){
			System.out.println("Strong");
		}
		else {
			System.out.println("Weak");
		}
		System.out.println("Again Enter the Choice (y/n):");
	    choice = sc.next().charAt(0);
	    if(choice=='n'){
	    	System.err.println("Thanks For Visting");
	    }
	  }while(choice=='y' || choice=='Y'); 	
	}

}
