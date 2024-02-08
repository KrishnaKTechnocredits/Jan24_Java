package rohini_deshmane.array_programs;
/*
 * Assignment - 49 : 8th Feb'2024

Write a method which accept String Array and return char Array. 
return last character of each word, if last character is digit, then consider second last character.

input : techno credits32 pune4 indi5a
output : o3ea
 */
public class GetStringArrayPrintCharArray {
	
	char getLastCharFromString(String str) {
		char lastChar='s';
		char lastCh = str.charAt(str.length()-1);
		if(Character.isDigit(lastCh)) {
			lastChar = str.charAt(str.length()-2);
		}
		else
			lastChar = str.charAt(str.length()-1);
		
		return lastChar;
	}
	
	char[] printCharArray(String[] strArr) {
		char[] newArr = new char[strArr.length];
		
		for(int i=0; i<strArr.length; i++) {
			newArr[i] = getLastCharFromString(strArr[i]);
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		String str = "techno credits32 pune4 indi5a";
		String[] strArr = new String[5];
		char[] newArr = new char[strArr.length];
		strArr = str.split(" ");
		
		GetStringArrayPrintCharArray getCharStr = new GetStringArrayPrintCharArray();
		newArr = getCharStr.printCharArray(strArr);
		
		for(int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

}
