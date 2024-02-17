/*Assignment - 61 : 16th Feb'2024

"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11" */

package padmaja;

public class SumOfNegativeNos {

	void printSumOfNegativeNos(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == '-') {
				char ch1 = str.charAt(index + 1);
				if (Character.isDigit(ch1))
					sum = sum + Character.getNumericValue(ch1) * -1;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfNegativeNos sum = new SumOfNegativeNos();
		sum.printSumOfNegativeNos("te-3ch4noc7red-8its");
	}
}
