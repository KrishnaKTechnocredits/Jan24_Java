//Remove all the vowels from given String.
package shridhar_k;

public class Assignment26 {
	void removeVowels(String inputStr) {
		System.out.println("input: " + inputStr);
		for (int i =0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				String ch1 = String.valueOf(ch);
				inputStr = inputStr.replace(ch1, "");
			}
		}
		System.out.println("output: "+ inputStr);
	}
	public static void main(String[] arg) {
		new Assignment26().removeVowels("technocredits");
	}
}
