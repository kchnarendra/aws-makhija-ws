package timepass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest4 {

	public static void main(String[] args) {

		int[] arr = { 4, 35, 12, 22, 203, 56, 2022, 2 };

		List<int[]> output = Stream.of(arr).filter(x -> x.toString().startsWith("2")).collect(Collectors.toList());

		HashMap<String, Integer> map = new HashMap();
		map.put("a", 3);
		map.put("b", 5);
		map.put("d", 1);
		map.put("e", 2);
		map.put("c", 4);
		System.out.println(map);

		// [{“a”,3},{“b”,5},{“d”,1},{“e”,2},{“c”,4}];

		// Collections.sort(map, map.get);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println(returnValue());

	}

	private static int returnValue() {

		try {
			return 1;
		} catch (Exception ex) {
			return 2;
		} finally {
			return 3;
		}
		//return 4;
	}

}

//Map<String,Integer> map = [{“a”,3},{“b”,5},{“d”,1},{“e”,2},{“c”,4}]
//Map<String,Integer> map = [{“d”,1},{“e”,2},{“a”,3},{“c”,4},{“b”,5}]

//Int arr[] = {4,35,12,22,203,56,2022,2}

//Output: {22,203,2022,2}
