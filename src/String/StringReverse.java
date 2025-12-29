package String;

public class StringReverse {
	
	public static void main(String[] args) {

	String name="Developer";
	String rev=" ";
	// iterator
	// length()-1
	for(int i=name.length()-1;i>=0;i--){
		
	  rev =rev+name.charAt(i);
		
	}	
	System.out.println(rev);
}
	
}
