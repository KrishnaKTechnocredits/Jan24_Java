//Assignment 15 : On user defined range print first 3 numbers which is divisible by 3 & 4.

package padmaja;

public class FirstThreeNumbers {
	void printFirstThreeNumbers(int startIndex, int endIndex) {
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
			if (count == 3)
				break;
			}
		}
	}

public static void main(String[] args) {
		FirstThreeNumbers firtThreeNumbers = new FirstThreeNumbers();
		firtThreeNumbers.printFirstThreeNumbers(10, 500);
	}
}
