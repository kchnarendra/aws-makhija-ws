package timepass.narendra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class NarendraMainSort {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("ten", 10);
		map.put("eight", 8);
		map.put("two", 2);
		map.put("four", 4);

		System.out.println(map);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).forEach(System.out::println);
		// // doesn't work

		System.out.println("***************************");

		Map<Employee, Integer> empMap = new HashMap<>();
		empMap.put(new Employee(2, "Narendra", 545550, Arrays.asList("99999999991", "99999999992")), 10);
		empMap.put(new Employee(1, "Birendra", 999550, Arrays.asList("77777777772", "77777777771")), 20);
		empMap.put(new Employee(4, "Ashok", 444440, Arrays.asList("66666666661", "66666666662")), 40);
		empMap.put(new Employee(5, "Kishore", 5464564, Arrays.asList("55555555551", "5555555552")), 50);
		empMap.put(new Employee(3, "Sai", 234445, Arrays.asList("22222332222", "4444222222222")), 30);
		System.out.println("***************************");
		System.out.println(empMap);
		System.out.println("***************************");

		empMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("***************************");
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
				.forEach(System.out::println);
		
		System.out.println("***************************");
		
		empMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println);
	}

}
