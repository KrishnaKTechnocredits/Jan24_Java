package nisarg_patel;

public class Assignment13DivisionLastNumber {

	int count;

	void printLastDivNo(int start, int end) {
		for (int num = start; num <= end; num++) {
			if (num % 5 == 0 && num % 9 == 0) {
				count = num;
			}
		}
		System.out.println("Last no divisible by " + start + " and " + end + " is " + count);
	}

	public static void main(String[] args) {
		Assignment13DivisionLastNumber assignment13DivisionLastNumber = new Assignment13DivisionLastNumber();
		assignment13DivisionLastNumber.printLastDivNo(5, 100);
	}
}
