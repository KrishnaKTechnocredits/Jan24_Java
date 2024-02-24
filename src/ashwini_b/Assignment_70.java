package ashwini_b;

/*
 String str = ""H5el6lo Hi Tech3noc2redits Pulne"";
output: 
                  56Hе11о
                       Hi 
          32Technocredits  
                    1Pune
                    
 */
public class Assignment_70 {

	String[] digitAtStart(String[] input) {
		String[] finalResultArry = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			String digitStr = "";
			String alphaStr = "";
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch)) {
					digitStr = digitStr + ch;
				} else {
					alphaStr = alphaStr + ch;
				}
			}
			finalResultArry[i] = digitStr + alphaStr;
		}
		return finalResultArry;
	}

	// find maximum length of string in array
	int getMaxLengthWord(String[] input) {
		int maxlength = 0;
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (str.length() > maxlength) {
				maxlength = str.length();
			}
		}
		return maxlength;
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
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		Assignment_70 assignment_70 = new Assignment_70();
		String[] arrOfStr = str.split(" ");
		String[] finalResultArry1 = assignment_70.digitAtStart(arrOfStr);
		assignment_70.wordSpaces(finalResultArry1);
	}

}
