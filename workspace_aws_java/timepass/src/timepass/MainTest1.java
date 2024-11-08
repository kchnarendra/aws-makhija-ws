package timepass;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTest1 {

	public static void main(String[] args) {
		int[] array = {1,4,5,6,7,9,8};
		IntStream array2 = Arrays.stream(array).sorted();
		int[] array3 =array2.toArray();
		int r = array3[array3.length -2];
		System.out.println(r);
	}

}
