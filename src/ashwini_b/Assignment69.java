package ashwini_b;

/*
 String str = "Hel12lo Hi Technocredits Pune";
output:
        Hello
           Hi
Technocredits
         Pune
 */
public class Assignment69 {

	// find maximum length of string in array
	int getMaxLengthWord(String[] input) {
		int maxlength = 0;
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (str.length() > maxlength) {
				maxlength = str.length();
			}
		}
		//System.out.println(maxlength);
		return maxlength;
	}

	// remove digit from string and return string without digit.
	String removeDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		//System.out.println(str);
		return str;
	}

	void wordSpaces(String[] strarry) {
		int maxlength = getMaxLengthWord(strarry);
		for (int i = 0; i < strarry.length; i++) {
			String strWithSpaces = "";
			String str = strarry[i];
			int spacelength = maxlength - str.length();
			for (int j = 0; j < spacelength; j++) {
				strWithSpaces = strWithSpaces + " ";
				
			}
			strWithSpaces = strWithSpaces + str;
			System.out.println(strWithSpaces);
		}
	}

	public static void main(String[] args) {
		String str = "Hel12lo Hi Technocredits Pune";
		Assignment69 assignment69 = new Assignment69();
		String strWithoutDigit = assignment69.removeDigit(str);
		String[] arrOfWords = strWithoutDigit.split(" ");
		//int maxlength = assignment69.getMaxLengthWord(arrOfWords);
		assignment69.wordSpaces(arrOfWords);
	}
}
