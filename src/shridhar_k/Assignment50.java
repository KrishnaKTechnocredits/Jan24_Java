//WAP to find count of digits in a given String.

package shridhar_k;

public class Assignment50 {
	
	void printDigitNumber (String inpString) {
		int count = 0;
		for (int i =0 ; i<inpString.length(); i++) {
			if(Character.isDigit(inpString.charAt(i))) {
				count++;
			}
		}
		System.out.println("output : " + count);
	}
	
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new Assignment50().printDigitNumber(str);
	}
}
