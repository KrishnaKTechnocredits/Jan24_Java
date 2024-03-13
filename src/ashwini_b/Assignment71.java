package ashwini_b;

/*
 "String str = ""H5el2lo Hi Tech3noc2redits Pulne"";
output
                   7Hello 
                      0Hi
           5Technocredits
                    1Pune
 */
public class Assignment71 {

	String[] AddDigtAtStart(String[] input) {
		String[] newArray = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			String alphaStr = "";
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				} else {
					alphaStr = alphaStr + ch;
				}
			}
			newArray[i] = sum + alphaStr;
			// System.out.println(newArray[i]);
		}
		return newArray;
	}

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

	void rightAligned(String[] input) {
		int maxlength = getMaxLengthWord(input);
		for (int i = 0; i < input.length; i++) {
			String strWithSpaces = "";
			String str = input[i];
			int spaceLength = maxlength - str.length();
			for (int j = 0; j < spaceLength; j++) {
				strWithSpaces = strWithSpaces + " ";
			}
			strWithSpaces = strWithSpaces + str;
			System.out.println(strWithSpaces);
		}
	}

	public static void main(String[] args) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] arrayOfWords = str.split(" ");
		Assignment71 assignment71 = new Assignment71();
		String[] finalArray = assignment71.AddDigtAtStart(arrayOfWords);
		assignment71.rightAligned(finalArray);
	}

}
