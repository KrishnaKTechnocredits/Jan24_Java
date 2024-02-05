package garima_s;

public class ReverseArray {
	
	void printReverseArray(int[] input) {
		int temp = 0;
		for (int index = (input.length - 1); index >= 0; index--) {
			temp = input[index];
			System.out.println("Reverse Array : " + temp);
		}
	}

	public static void main(String[] args) {
		int input[] = { 10, 20, 13, 27, 29, 13, 6 };
		new ReverseArray().printReverseArray(input);
	}
}
