package nisarg_patel;

public class Assignment32ReverseArray {

	void printReverseArray(int[] input) {
		int temp = 0;
		System.out.print("Reverse Array : ");
		for (int index = (input.length - 1); index >= 0; index--) {
			temp = input[index];
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		int input[] = { 10, 20, 13, 27, 29, 13, 6 };
		new Assignment32ReverseArray().printReverseArray(input);
	}
}
