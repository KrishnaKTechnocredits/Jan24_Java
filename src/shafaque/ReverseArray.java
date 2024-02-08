package shafaque;

public class ReverseArray {

	public static void reverseInteger(int[] arr) {
		for (int i = arr.length; i > 0; i--)
			System.out.println(arr[i - 1]);

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		reverseInteger(arr);

	}

}
