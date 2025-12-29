package Stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EvenOdd_ByStream {

	public static void main(String[] args) {
		
		
//		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		number.stream().filter(num -> num%2==0).forEach(s -> System.out.println(s));
		
//	    int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		Arrays.stream(arr).filter(num -> num%2==1).forEach(a -> System.out.println(a));
		
		int[] array = {1,2,3,4,3,2,1,4,9,4};
		
		Set<Integer> list = new HashSet<Integer>();
		
		for(int s :array) {
			
			list.add(s);	
			
		}
	
		System.out.println(list);
				
	}
	
	
}
