package nisarg_patel;

public class Assignment14SumNumber {

	int sum;

	void printSum(int start, int end) {
		for (int num = start; num <= end; num++) {
			if (num % 5 == 0 && num % 10 == 0) {
				sum = sum + num;
			}
		}
		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		Assignment14SumNumber assignment14SumNumber = new Assignment14SumNumber();
		assignment14SumNumber.printSum(10, 50);
	}
}
