package LogicalPractice;

public class StrReverse {

	public static void main(String[] args) {
		
		String name ="Developer";
		String str ="";
		
		for(int i =name.length()-1;i>=0;i--){
			str = str+name.charAt(i);
		}
		System.out.println("Reverse String "+str);
	}
	
}
