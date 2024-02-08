//Print difference between sum of all the odd digits and even digits in the given String.

package priya_t;

public class Assignment29_DiffbetSumofEvenOddNo {

	boolean printDiff(String str) {
		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;
		String s = "te3ch4noc7re9d8its";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int b = Integer.parseInt(String.valueOf(ch));
				// System.out.println(b);
				if (ch % 2 == 0)
					sumEven = sumEven + b;
				else {
					sumOdd = sumOdd + b;
				}
			}
		}
		System.out.println(" Sum of Even No:" + sumEven);
		System.out.println(" Sum of Odd No:" + sumOdd);
		int diff = sumOdd - sumEven;
		System.out.println(" Diff of sum of Even and odd digits:" + diff);
		return false;
	}

	public static void main(String[] args) {
		Assignment29_DiffbetSumofEvenOddNo diff = new Assignment29_DiffbetSumofEvenOddNo();
		diff.printDiff("te3ch4noc7re9d8its");
	}
}