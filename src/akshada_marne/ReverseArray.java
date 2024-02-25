package akshada_marne;

public class ReverseArray {
	void reverse(int[] num) {
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}

	}

	public static void main(String args[]) {
		ReverseArray reverseArray = new ReverseArray();

		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		reverseArray.reverse(arr);
	}
}
