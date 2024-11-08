package timepass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		//String inputStr = "ababab";
		//String inputStr = "level";
		String inputStr = "moon";
		
		int j = inputStr.length()-1;
		for(int i=1; i<inputStr.length(); i++) {
			
			String str1 = inputStr.substring(0, i);
			list1.add(str1);
			
			String str2 = inputStr.substring(j, inputStr.length());
			list2.add(str2);
			
			j--;
		}
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(list2);
		Set<String> outputStr = list1.stream().filter(x -> Collections.frequency(list1, x)>1).collect(Collectors.toSet());
		System.out.println(outputStr);
		
		
		//list1.retainAll(list2);
	}

}
