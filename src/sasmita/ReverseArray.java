package sasmita;

public class ReverseArray {
	void printReverseArray(int[] arr) {
		for (int index =arr.length-1 ; index >=0; index--) {
			System.out.println(arr[index] );
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		new ReverseArray().printReverseArray(arr);

	}
}
