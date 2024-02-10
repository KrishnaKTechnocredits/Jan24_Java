/*
 Write a method which accept String Array and return char Array. 
return last character of each word, if last character is digit, then consider second last character.
input : techno credits32 pune4 indi5a
output : o3ea
 */
package gaurav_garg;

public class LastCharacterOfStringWordAssignement49 {

	char[] returnLastCharacter(String stringarray[]) {
		char chararray[] = new char[stringarray.length];
		for (int index = 0; index < stringarray.length; index++) {
			if (Character.isDigit(stringarray[index].charAt(stringarray[index].length() - 1)))
				chararray[index] = stringarray[index].charAt(stringarray[index].length() - 2);
			else
				chararray[index] = stringarray[index].charAt(stringarray[index].length() - 1);
		}
		return chararray;
	}

	public static void main(String[] args) {
		String string1 = "techno credits32 pune4 indi5a";
		String stringarray[] = string1.split(" ");
		LastCharacterOfStringWordAssignement49 lastCharacterOfStringWordAssignement49 = new LastCharacterOfStringWordAssignement49();
		char chararray[] = lastCharacterOfStringWordAssignement49.returnLastCharacter(stringarray);
		System.out.println(chararray);
	}
}
