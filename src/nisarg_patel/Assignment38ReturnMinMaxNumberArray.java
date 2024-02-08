package nisarg_patel;

public class Assignment38ReturnMinMaxNumberArray {

	void printMaxAndMinNumber(int[] input) {
		int maxNum = 0;
		int minNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (maxNum < input[index]) {
				maxNum = input[index];
			}
			if (minNum >= input[index]) {
				minNum = input[index];
			}
		}
		System.out.println("Maximum Number in a given array : " + maxNum);
		System.out.println("Minimum Number in a given array : " + minNum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 50, 60, 30 };
		new Assignment38ReturnMinMaxNumberArray().printMaxAndMinNumber(input);
	}
}
