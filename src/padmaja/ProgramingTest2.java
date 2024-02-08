/**Programming test - 1 : 02 Feb'2024
*
Print last even number from a String

input : te3ch4nocred8its
output : 8*/

package padmaja;

public class ProgramingTest2 {

	void printLastevenNo(String str) {
		int lastEvenNo = 0;
		for (int index = 0; index < str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int tmp = Character.getNumericValue(ch);
				if (tmp % 2 == 0)
					lastEvenNo = tmp;
			}
		}
		System.out.println(lastEvenNo);
	}

	public static void main(String[] args) {
		ProgramingTest2 test2 = new ProgramingTest2();
		test2.printLastevenNo("te3ch4nocred8its");
	}
}
