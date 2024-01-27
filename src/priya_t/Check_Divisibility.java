package priya_t;

public class Check_Divisibility {

	public void printNumberDiv3and5(int startIndex, int endIndex) {

		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 5 == 0) {

				System.out.println(num);
			}
		}

	}

	public static void main(String[] args) {
		Check_Divisibility divisibility = new Check_Divisibility();
		divisibility.printNumberDiv3and5(5, 40);

	}

}
