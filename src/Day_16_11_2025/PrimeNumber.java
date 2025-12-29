package Day_16_11_2025;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int counter=0;
			//	i=1 ;1<7 ;
		for(int i=1;i<num;i++){
			// 7%1==0
			if(num%i==0){
				counter++; // count +1
			}
		}
		if(counter==2){   // 2==2
			System.out.println("Even num");
		}
		else{
			System.out.println("Not Even num");
		}
	}
}
// prime number means self divide or 1 divide 
