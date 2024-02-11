package nisarg_patel;

public class Assignment35SumOfEvenIndex {

	int getSumEvenIndex(int[] input) {
		int sumEven = 0;
		for (int index = 0; index < input.length; index++) {
			if (index % 2 == 0) {
				sumEven = sumEven + input[index];
			}
		}
		System.out.println("Sum of Even index in array: " + sumEven);
		return sumEven;
	}

	public static void main(String[] args) {
		int input[] = { 3, 6, 9, 11, 15, 20, 4, 26 };
		new Assignment35SumOfEvenIndex().getSumEvenIndex(input);
	}

}
