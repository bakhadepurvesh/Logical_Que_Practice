package Day_16_11_2025;

public class Sunday {

	public static void main(String[]args) {
      
		String str = "Developer";
		 String rev="";
		 
		 for(int i=0; i<str.length()-1;i--){
			 rev = rev + str.charAt(i);
		 }
		 System.out.println(rev);
		 
		 for(int i=str.length()-1;i>=0;i--){
			 rev = rev + str.charAt(i);
		 }
		 System.out.println(rev);
	}

}
