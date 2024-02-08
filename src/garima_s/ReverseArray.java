package garima_s;

public class ReverseArray {
	
	void printReverseArray(int[] input) {
		System.out.print("Reverse Array : ");
		for (int index = (input.length - 1); index >= 0; index--) {
			System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		int input[] = { 10, 20, 13, 27, 29, 13, 6 };
		new ReverseArray().printReverseArray(input);
	}
}
