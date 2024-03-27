package hiral_purohit;
/*11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.
.............................................................
*/

public class Assignment_97 {

	void toFindNumberArmstrong(int num) {
		int digit = 0;
		int result = 0;
		int originalNum = num;
		while (num != 0) {
			digit = num % 10;
			result += Math.pow(digit, 3);
			num /= 10;
		}
		if (result == originalNum) {
			System.out.println(originalNum + " is an Armstrong number");
		} else {
			System.out.println(originalNum + " is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		Assignment_97 assignment_97 = new Assignment_97();
		System.out.println("...........Variation 1.................");
		assignment_97.toFindNumberArmstrong(153);

	}
}
