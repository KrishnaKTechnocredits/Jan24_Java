/*Assignment - 82 : 14th March'2024
String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14

NOTE : use Exception concept */
package sveta;

public class Assignment_82 {

	void sumOfDigit(String str) {
		String[] strarr= str.split(" ");
		int sum=0;
		for(int i=0;i<strarr.length;i++) {
			try {
				sum+=Integer.parseInt(strarr[i]);
			}catch(NumberFormatException e) {
			}	
		}
		System.out.println("Sum is "+sum);
	}
	
	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		Assignment_82 ass_82 = new Assignment_82();
		ass_82.sumOfDigit(str);
		
	}

}
