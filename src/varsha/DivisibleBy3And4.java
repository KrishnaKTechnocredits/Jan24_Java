package varsha;

public class DivisibleBy3And4 {

	void printDivInfo(int startIndex, int endIndex) {
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				count++;
				if (count <= 3) {
					System.out.println(num + " : is divisible by 3 & 4");
				}
			}
		}
	}

	public static void main(String[] args) {
		DivisibleBy3And4 divisibleBy3And4 = new DivisibleBy3And4();
		divisibleBy3And4.printDivInfo(10, 500);
	}
}
