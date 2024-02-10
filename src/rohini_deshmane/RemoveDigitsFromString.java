package rohini_deshmane;
/*
 * Assignment - 51 : 9th Feb'2024
WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune
 */
public class RemoveDigitsFromString {
	
	String removeDigits(String str) {
		String output="";
		char ch; 
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(!Character.isDigit(ch)) {
				output =output + str.charAt(index);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		RemoveDigitsFromString removeDigitsFromString = new RemoveDigitsFromString();
		String str = "H2i H3el4lo P4un2e5";
		System.out.println("String before digit removal = "+str);
		str = removeDigitsFromString.removeDigits(str);
		System.out.println("String after digit removal = "+str);
	}
}
