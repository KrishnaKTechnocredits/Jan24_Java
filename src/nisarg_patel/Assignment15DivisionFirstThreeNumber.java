package nisarg_patel;

public class Assignment15DivisionFirstThreeNumber {

	void printLastNumber(int startIndex, int endIndex) {
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println("First 3 numbers divisible by 3 and 4 is : " + num);
				count++;
			}
			if (count == 3)
				break;
		}
	}

	public static void main(String[] args) {
		Assignment15DivisionFirstThreeNumber assignment15DivisionFirstThreeNumber = new Assignment15DivisionFirstThreeNumber();
		assignment15DivisionFirstThreeNumber.printLastNumber(10, 500);
	}
}
