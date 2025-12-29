package Day_16_11_2025;

public class ReverseTheStringArray {

	public static void main(String[] args) {
		
	String  str ="Suyash";
	String rev="";
	
  char[] arr=str.toCharArray();
  
  for(int i=arr.length-1;i>=0;i--){
	  rev = rev+arr[i];
  }
	System.out.println(rev);
}
	
}
// Converts string -> toCharArray() is return the char[]
//  Converts string -> split() is return the String[]

