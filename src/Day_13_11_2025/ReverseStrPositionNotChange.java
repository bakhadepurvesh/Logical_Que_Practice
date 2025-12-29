package Day_13_11_2025;

public class ReverseStrPositionNotChange {

	public static void main(String[] args) {

		String str = "Java Developer";
		String str2 = "";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length()-1; j >=0; j--) {
				str2 =str2 + arr[i].charAt(j);
			}
		}
		 System.out.println(str2);
	}
}

// Input Java Developer     Split() method is used convert String to return String []