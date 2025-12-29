package LogicalPractice;

import java.util.Scanner;

public class ArmStrongNum {
	
	
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number :");
		 int num =sc.nextInt();
		 int box = num;
		 int stored =0;
		  while(0<num){  
			    int digit = num%10;
			    stored = stored + (digit*digit*digit);
			    num=num/10; 
		  }
		  if(box==stored){
			  System.out.println("Armstrong");
		  }else {
			  System.out.println("Not Arm Strong ");
		  }
		
	}
	
}
