package timepass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest2 {

	public static void main(String[] args) {
		//Find second largest number in an array
		int[] arr1={7,5,6,1,4,2};
		
		List ll = Arrays.asList(arr1);
		Collections.sort(ll);
		System.out.println(ll);
		
		Arrays.sort(arr1);
		System.out.println("Second largest = " + arr1[arr1.length -2]);
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	
		
		List list =Arrays.asList(arr1);
		List list2 = (List) list.stream().sorted().collect(Collectors.toList());

	}

}
