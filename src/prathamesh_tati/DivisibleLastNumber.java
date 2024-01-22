 /* Assignment - 12 : 21st Jan'2024 
 On user defined range print last number which is divisible by 5 & 9.*/

package prathamesh_tati;

public class DivisibleLastNumber {

	void printLastNumberDivisible(int startRange, int endRange) {
		for (int num = endRange; num >= startRange; num--) {
			if (num % 5 == 0 && num % 9 == 0) {
				System.out.println("Last number divisble by 5 & 9 is " + num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		DivisibleLastNumber divisibleLastNumber = new DivisibleLastNumber();
		divisibleLastNumber.printLastNumberDivisible(5, 100);
	}
}