/*Assignment - 82 : 14th March'2024
String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14

NOTE : use Exception concept */
package madhura_kulkarni;

public class Assignment82 {
	void findSumOfNumbersInString(String[] str1) {
		int sum = 0;
		for (int i = 0; i < str1.length; i++) {
			try {
				sum += Integer.parseInt(str1[i]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println("Sum of Numbers in given String : " + sum);
	}

	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		String[] str1 = str.split(" ");
		System.out.println("Given String is : " + str);
		new Assignment82().findSumOfNumbersInString(str1);
	}

}
