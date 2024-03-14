package rohini_deshmane.exception_handling;
/*
Assignment - 82 : 14th March'2024
String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14

NOTE : use Exception concept 
 */
public class NumberExcpetionExample {

	void checkNumber(String str) {
		int sum=0;
		String[] strArr = str.split(" ");
		for(int i=0; i <strArr.length; i++) {
			try {
				sum = sum + Integer.parseInt(strArr[i]);
			} catch(NumberFormatException e) {
				
			}
		}
		System.out.println("Sum of Digits = "+sum);
	}
	
	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		new NumberExcpetionExample().checkNumber(str);
	}
}
