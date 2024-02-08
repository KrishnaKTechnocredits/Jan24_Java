package akshay_gaikwad;

public class RearrangeStringDigUpLow {
	void printRearrangeString(String str) {
		String digitStr = "";
		String upCaseStr = "";
		String lowCaseStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr += ch;
			} else if (Character.isUpperCase(ch)) {
				upCaseStr += ch;
			} else if (Character.isLowerCase(ch)) {
				lowCaseStr += ch;
			}
		}
		System.out.println("Rearranged string is : " + (digitStr + upCaseStr + lowCaseStr));
	}
	
	public static void main(String[] args) {
		new RearrangeStringDigUpLow().printRearrangeString("Aas*H3/v7i");
	}
}
