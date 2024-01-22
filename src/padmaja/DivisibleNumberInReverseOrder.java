//Assignment 12 :On user defined range print all numbers which are divisible by 7 or 13 in reverse order.

package padmaja;

public class DivisibleNumberInReverseOrder {
	void divisibleNumberInReverseOrder(int startIndex, int endIndex) {
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7 ");
			else if (num % 13 == 0)
				System.out.println(num + " is divisible by 13 ");
		}
	}

	public static void main(String[] args) {
		DivisibleNumberInReverseOrder divisibleNumberInReverseOrder = new DivisibleNumberInReverseOrder();
		divisibleNumberInReverseOrder.divisibleNumberInReverseOrder(5, 40);
	}
}
