package hiral_purohit;

public class Assignment_77_3 {

	void toGetAllMissingNumber(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("missing numbers in array is: " + i);
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new Assignment_77_3().toGetAllMissingNumber(x);
	}

}
