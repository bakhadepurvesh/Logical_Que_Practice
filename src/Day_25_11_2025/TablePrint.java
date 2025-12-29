package Day_25_11_2025;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int numTable =sc.nextInt();
		int table=0;
		for(int i=1;i<=10;i++) {
			table =i*numTable;
			System.out.println(i+"x"+numTable+"="+table);
		}
		
		
	}
}
// print the table 