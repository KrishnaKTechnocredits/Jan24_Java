/** Assignment - 13 : 21st Jan'2024 
 On user defined range print sum of all the number which is divisible by 5 & 10.*/

package prathamesh_tati;

public class SumOfNumbers {

	int sum = 0;

	void additionOfDivisibleNumbers(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 10 == 0) {
				sum = sum + num;
			}
		}
		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		sumOfNumbers.additionOfDivisibleNumbers(10, 50);
	}
}