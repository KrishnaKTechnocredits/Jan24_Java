package priya_t;

public class PrintFirst3No {

	public void printFirstThreeNumberDiv3and4(int startIndex, int endIndex) {
		int count = 0;

		for (int num = startIndex; num <= endIndex; num++) {

			if (num % 3 == 0 && num % 4 == 0) {

				System.out.println("First Three Numbers divisible by 3 & 4 : " + num);
				count = count + 1;

				if (count == 3) {
					break;
				}

			}
		}

	}

	public static void main(String[] args) {
		PrintFirst3No lastno = new PrintFirst3No();
		lastno.printFirstThreeNumberDiv3and4(10, 500);

	}
}
