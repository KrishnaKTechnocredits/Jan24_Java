/*String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14*/

package akshay_gaikwad;

public class ExceptionAssignment {
	void getSumOfDigits(String input) {
		int count = 0;
		String arr[] = input.split(" ");
		for(String str : arr) {
			try{
				count += Integer.parseInt(str);
			} catch(NumberFormatException e) {
				continue;
			}
		}
		System.out.println("Sum of all numbers in given string is " + count);;
	}
	
	public static void main(String[] args) {
		new ExceptionAssignment().getSumOfDigits("I am having 11 years and 3 months of experience in java selenium");
	}
}
