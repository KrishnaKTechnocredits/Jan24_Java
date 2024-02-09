//WAP to remove all digits from given String.
package shridhar_k;

public class Assignment50 {
	
	void printStringWithoutDigit(String inpString) {
		String newString = "";
		for(int i = 0; i< inpString.length(); i++) {
			char ch = inpString.charAt(i);
			if(!Character.isDigit(ch)) {
				newString = newString + ch;
			}
		}
		System.out.println("output : " + newString);
	}
	
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new Assignment50().printStringWithoutDigit(str);
	}
}
