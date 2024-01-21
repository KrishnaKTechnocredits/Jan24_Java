/* Assignment - 11 : 21st Jan'2024 
 * On user defined range print all numbers which are divisible by 7 or 13 in reverse order. */

package prathamesh_tati;

public class ReverseOrderNumberDivision {

	void numberDivision(int startRange, int endRange) {
		for (int num = endRange; num >= startRange; num--) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			else if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}

	public static void main(String[] args) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		ReverseOrderNumberDivision reverseOrderNumberDivision = new ReverseOrderNumberDivision();
		reverseOrderNumberDivision.numberDivision(5, 40);
	}
}