package timepass;

public class MainTest3 {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 7, 3, 9, 8 };

		int[] result = bubleSort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}


	}

	public static int[] bubleSort(int[] array) {
		int ln = array.length;
		for (int i = 0; i < ln - 1; i++) {
			for (int j = 0; j < ln - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
