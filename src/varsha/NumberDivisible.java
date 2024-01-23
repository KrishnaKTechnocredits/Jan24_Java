package varsha;

public class NumberDivisible {

	void printDivisibleInfo(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + " : is divisible by 3 & 5");
			}
		}
	}

	public static void main(String[] args) {
		NumberDivisible numberDivisible = new NumberDivisible();
		numberDivisible.printDivisibleInfo(5, 40);
	}
}
