package timepass.narendra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NarendraMainFlatMap {

	public static void main(String[] args) {

		List<Employee> empList = Stream
				.of(new Employee(1, "Narendra", 9999, Arrays.asList("9999999", "1111111")),
						new Employee(3, "Ashok", 8888, Arrays.asList("33333333", "1111111")),
						new Employee(1, "Bishal", 7777, Arrays.asList("777777", "5555555")))
				.collect(Collectors.toList());

		System.out.println(empList);

		List<String> names = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(names);

		List<List> contacts = empList.stream().map(emp -> emp.getContacts()).collect(Collectors.toList());
		System.out.println(contacts);

		List<String> contactSep = (List<String>) empList.stream().flatMap(emp -> emp.getContacts().stream())
				.collect(Collectors.toList());
		System.out.println(contactSep);

		Object collect = empList.stream().flatMap(emp -> emp.getContacts().stream()).collect(Collectors.toSet());
		System.out.println(collect);
	}

}
