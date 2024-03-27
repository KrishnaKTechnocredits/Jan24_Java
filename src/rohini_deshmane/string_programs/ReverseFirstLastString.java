package rohini_deshmane.string_programs;
/*
Assignment - 88 : 24th March'2024 [15-20 mins]
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT
 */
public class ReverseFirstLastString {

	String reverseStr(String str) {
		String reverseStr="";
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr = reverseStr+str.charAt(i);
		}
		return reverseStr;
	}
	
	void printReverseString(String str) {
		String[] strArr = str.split(" ");
		String reverseStr="";
		System.out.println(str);
		for(int i=0; i<strArr.length; i++) {
			if(i ==0 || i==strArr.length-1) {
				reverseStr = reverseStr +" "+ reverseStr(strArr[i]);
			} else {
				reverseStr = reverseStr+ " " + strArr[i];
			}
		}
		System.out.println(reverseStr);
	}
	
	public static void main(String[] args) {
		ReverseFirstLastString reverseFirstLastString = new ReverseFirstLastString();
		String str = "Welcome to the Technocredits";
		reverseFirstLastString.printReverseString(str);
	}
}
