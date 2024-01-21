package ashwini_b;

/*
 On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
 */
public class Lastnumdivby5And9 {

	void printNumDivisibleBy59(int startIndex, int endIndex) {
		
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 5 == 0 && index % 9 == 0) {
				System.out.println("Last number divisible by 5 & 9 is " + index);
				break;

			}
		}
	}

	public static void main(String[] args) {
		Lastnumdivby5And9 lastnumdivby5And9 = new Lastnumdivby5And9();
		lastnumdivby5And9.printNumDivisibleBy59(5, 100);
	}

}
