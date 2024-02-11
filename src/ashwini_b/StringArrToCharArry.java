package ashwini_b;

/*
Assignment - 49 : 8th Feb'2024
Write a method which accept String Array and return char Array. 
return last character of each word, if last character is digit, then consider second last character.
input : techno credits32 pune4 indi5a
output : o3ea
 */
public class StringArrToCharArry {

	char[] getOutput(String[] arr) {
		char[] chArr = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			int lastCharIndex = arr[index].length() - 1;
			char lastChar = arr[index].charAt(lastCharIndex);

			if (Character.isDigit(lastChar)) {
				lastChar = arr[index].charAt(lastCharIndex - 1);
			}
			chArr[index] = lastChar;
		}
		return chArr;
	}

	void printChararr(char[] chararr) {
		for (int index = 0; index < chararr.length; index++) {
			System.out.print(chararr[index]);
		}
	}

	public static void main(String[] args) {
		String inputStr = "techno credits32 pune4 indi5a";
		String[] inputarray = inputStr.split(" ");
		StringArrToCharArry stringArrToCharArry = new StringArrToCharArry();
		char[] newchararry = stringArrToCharArry.getOutput(inputarray);
		stringArrToCharArry.printChararr(newchararry);
	}

}
