package LogicalPractice;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "wow";
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}

		if(str.equals(rev)){
			System.out.println("Palindrome_String");
		}
		else{
			System.err.println("Not-Palindrome_String");
		}
	}
	
}
