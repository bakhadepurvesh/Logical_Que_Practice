package LogicalPractice;

import java.util.Scanner;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int num = sc.nextInt();
		
		int a =0;
		int b =1;
		
		System.out.println(a+" "+b);
		
		for(int i =1; i<=num;i++){
			int c = a+b;
			System.out.println(c);
			a =b;
			b =c;
		}
		
	}

}
