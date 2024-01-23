//Assignment 13 : On user defined range print last number which is divisible by 5 & 9.

package padmaja;

public class LastNumber {
	void printLastNumber(int startRange, int endRange) {
		int lastNumber = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 9 == 0)
				// System.out.println(num + " is divisible by 5 and 9");
				lastNumber = num;
		}
		System.out.println(lastNumber + " is Last divisible number by 5 and 9");
	}

	public static void main(String[] args) {
		LastNumber lastNumber = new LastNumber();
		lastNumber.printLastNumber(5, 100);
	}
}
