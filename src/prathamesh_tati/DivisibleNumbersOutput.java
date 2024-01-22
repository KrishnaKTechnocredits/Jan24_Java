/* Assignment - 14 : 21st Jan'2024 
 On user defined range print first 3 numbers which is divisible by 3 & 4.*/

package prathamesh_tati;

public class DivisibleNumbersOutput {

	int count = 0;

	void printNumbersDivisibleBy_3and4(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {

			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
			}
			if (count == 3)
				break;
		}
	}

	public static void main(String[] args) {
		DivisibleNumbersOutput DivisibleNumbersOutput = new DivisibleNumbersOutput();
		System.out.println("First 3 numbers divisible by 3 and 4 are :"); 
		DivisibleNumbersOutput.printNumbersDivisibleBy_3and4(10, 500);
	}
}