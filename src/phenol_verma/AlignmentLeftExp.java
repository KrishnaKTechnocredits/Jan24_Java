/*
 * Assignment - 69_70_71_72 : 22nd Feb'2024
 * PhenolV_Assignment_75
 * ****************************************
 * Assignment - 69
 * String str = "Hello Hi Technocredits Pune"
output : 
	    Hello
	       Hi
Technocredits
         Pune
* ****************************************
* Assignment - 70
* String str = "H5el6lo Hi Te3chnoc2redits Pune"
* Digit at first place
output : 
	    56Hello
	         Hi
32Technocredits
           Pune
* ****************************************
* Assignment - 71
* Sum of digit at first place
* String str = "H5el6lo Hi Te3chnoc2redits Pune"
output : 
	   11Hello
	        Hi
5Technocredits
          Pune
* ****************************************
* Assignment - 72
* String str = "H5el6lo Hi Te3chnoc2redits Pune"
* Sum of digit at last
output : 
	    Hello
	       Hi
Technocredits
         Pune
           16
 */

package phenol_verma;

public class AlignmentLeftExp {

	String[] maxLenth(String str) {
		int charWithMaxLength = 0;
		String maxLengthWord = " ";
		String[] splitStr = str.split(" ");
		for (int index = 0; index < splitStr.length; index++) {
			int wordLenght = splitStr[index].length();
			if (charWithMaxLength < wordLenght) {
				charWithMaxLength = wordLenght;
				maxLengthWord = splitStr[index];
			}
		}
		return new String[] { charWithMaxLength + "", maxLengthWord };
		// result[0] -> charWithMaxLength
		// result[1] -> maxLengthWord
	}

	void assignment69(String str) {
		String[] splitStr = str.split(" ");
		String[] result = maxLenth(str);
		int getLenghtOfSplitStrWord = 0;

		for (int index = 0; index < splitStr.length; index++) {
			int spaceCounter = 0;
			String spaceString = "";

			getLenghtOfSplitStrWord = splitStr[index].length();
			spaceCounter = Integer.parseInt(result[0]) - getLenghtOfSplitStrWord;
			for (int getSpaceString = 0; getSpaceString < spaceCounter; getSpaceString++) {
				spaceString = spaceString + " ";
			}
			System.out.println(spaceString + splitStr[index]);
		}
	}

	void assignment70(String str) {
		String[] splitStr = str.split(" ");
		String[] result = maxLenth(str);
		for (int index = 0; index < splitStr.length; index++) {
			int spaceCounter = 0;
			String spaceString = "";
			int getLenghtOfSplitStrWord = 0;
			String digitStr = "";
			String charStr = "";

			getLenghtOfSplitStrWord = splitStr[index].length();
			spaceCounter = Integer.parseInt(result[0]) - getLenghtOfSplitStrWord;
			for (int getSpaceString = 0; getSpaceString < spaceCounter; getSpaceString++) {
				spaceString = spaceString + " ";
			}
			for (int inIndex = 0; inIndex < splitStr[index].length(); inIndex++) {
				char chr = splitStr[index].charAt(inIndex);
				if (Character.isDigit(chr)) {
					digitStr = digitStr + chr;
				} else {
					charStr = charStr + chr;
				}
			}
			System.out.println(spaceString + digitStr + charStr);
		}
	}

	void assignment71(String str) {
		String[] splitStr = str.split(" ");
		String[] result = maxLenth(str);
		for (int index = 0; index < splitStr.length; index++) {
			int spaceCounter = 0;
			String spaceString = "";
			int digitStr = 0;
			String charStr = "";

			for (int inIndex = 0; inIndex < splitStr[index].length(); inIndex++) {
				char chr = splitStr[index].charAt(inIndex);
				if (Character.isDigit(chr)) {
					digitStr = digitStr + Character.getNumericValue(chr);
				} else {
					charStr = charStr + chr;
				}
			}
			int lenStrDigitNum = (digitStr + charStr).length();
			spaceCounter = Integer.parseInt(result[0]) - lenStrDigitNum;
			for (int getSpaceString = 0; getSpaceString < spaceCounter - 1; getSpaceString++) {
				spaceString = spaceString + " ";
			}
			System.out.println(spaceString + digitStr + charStr);
		}
	}

	void assignment72(String str) {
		String[] splitStr = str.split(" ");
		int sumDigit = 0;
		String resultAfterDigitOut = "";
		String resultWithSapce = "";

		for (int index = 0; index < splitStr.length; index++) {
			String charStr = "";
			for (int inIndex = 0; inIndex < splitStr[index].length(); inIndex++) {

				char chr = splitStr[index].charAt(inIndex);
				if (Character.isDigit(chr)) {
					sumDigit = sumDigit + Character.getNumericValue(chr);
				} else {
					charStr = charStr + chr;
				}
			}
			resultAfterDigitOut = resultAfterDigitOut + charStr + " ";
		}
        assignment69(resultAfterDigitOut);
		String[] result = maxLenth(resultAfterDigitOut);
		String sumdigit = sumDigit + "";
		for (int index = 0; index < Integer.parseInt(result[0]) - sumdigit.length(); index++)
			resultWithSapce = resultWithSapce + " ";
		resultWithSapce = resultWithSapce + sumDigit;
		System.out.println(resultWithSapce);
	}

	public static void main(String[] args) {
		AlignmentLeftExp alignmentLeftExp = new AlignmentLeftExp();

		String str1 = "Hello Hi Technocredits Pune";
		String str2 = "H5el8lo Hi Te3chnoc2redits Pune";

		System.out.println("*************************Assignment 69*************************");
		System.out.println("Input String - " + str1);
		System.out.println("Output Pattern - ");
		alignmentLeftExp.assignment69(str1);

		System.out.println("*************************Assignment 70*************************");
		System.out.println("Input String - " + str2);
		System.out.println("Output Pattern - ");
		alignmentLeftExp.assignment70(str2);

		System.out.println("*************************Assignment 71*************************");
		System.out.println("Input String - " + str2);
		System.out.println("Output Pattern - ");
		alignmentLeftExp.assignment71(str2);

		System.out.println("*************************Assignment 72*************************");
		System.out.println("Input String - " + str2);
		System.out.println("Output Pattern - ");
		alignmentLeftExp.assignment72(str2);
	}
}
