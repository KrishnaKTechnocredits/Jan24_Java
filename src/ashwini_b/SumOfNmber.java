package ashwini_b;

/*
 On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150
 */
public class SumOfNmber {

	int sum;

	void printSumOfNum(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {

			if (index % 5 == 0 && index % 10 == 0) {
				sum = sum + index;
			}
		}
		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		SumOfNmber sumOfNmber = new SumOfNmber();
		sumOfNmber.printSumOfNum(10, 50);
	}
}
