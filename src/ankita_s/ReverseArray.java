package ankita_s;

public class ReverseArray {
	void printArray(int[] input) {
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}

	void printReverseArray(int[] input) {
		for (int index = input.length - 1; index >= 0; index--) {
			System.out.print(input[index] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		ReverseArray reverseArray = new ReverseArray();
		System.out.println("Array is");
		reverseArray.printArray(arr);
		System.out.println();
		System.out.println("Reverse Array is");
		reverseArray.printReverseArray(arr);
	}
}
