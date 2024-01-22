package priya_t;

public class ReverseOrder_Divisibility {

	public void printNumberDiv7and13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13,numbers are:");

		for (int num = endIndex; num >= startIndex; num--) {

			if (num % 7 == 0 && num % 13 == 0) { 
				System.out.println(num + " is divisible by 7 & 13");
			} else if (num % 7 == 0) {
				System.out.println(num + " is divisible by 7");
			} else if (num % 13 == 0) {
				System.out.println(num + " is divisible by 13");

			}
		}

	}
    public static void main(String[] args) {
		ReverseOrder_Divisibility divisibility = new ReverseOrder_Divisibility();
		divisibility.printNumberDiv7and13(5, 40);

	}

}
