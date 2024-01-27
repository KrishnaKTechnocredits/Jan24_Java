package priya_t;

public class PrintLastNo {

	public void printLastNumberDiv5and9(int startIndex, int endIndex) {

		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 5 == 0 && num % 9 == 0) {
				System.out.println("Last no divisible by 5 & 9 is " + num);
				break;
			}
		}

	}

	public static void main(String[] args) {
		PrintLastNo divisibility = new PrintLastNo();
		divisibility.printLastNumberDiv5and9(5, 100);

	}
}
