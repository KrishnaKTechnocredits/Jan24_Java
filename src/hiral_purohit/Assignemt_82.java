package hiral_purohit;

/*String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14
NOTE : use Exception concept */
public class Assignemt_82 {

	void toGetSumOfDigit(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				sum = sum + Integer.parseInt(arr[i]);
			} catch (NumberFormatException ne) {
			}
		}
		System.out.println("sum of Digits in String: " + sum);
	}

	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		new Assignemt_82().toGetSumOfDigit(str);
	}
}
