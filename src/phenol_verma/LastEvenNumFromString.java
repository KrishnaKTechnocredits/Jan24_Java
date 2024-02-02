/*Programming test - 1 : 02 Feb'2024
Print last even number from a String

input : te3ch4nocred8its
output : 8*/

package phenol_verma;

public class LastEvenNumFromString {
	
	void findLastEvenNum(String str) {
		int lastEvenNum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) && Character.getNumericValue(ch) %2 == 0) {
				lastEvenNum = Character.getNumericValue(ch);
				}
		}
		System.out.println("Last even number from the string " + str + " is " + lastEvenNum);
	}

	public static void main(String[] args) {
		LastEvenNumFromString lastEvenNumFromString = new LastEvenNumFromString();
		lastEvenNumFromString.findLastEvenNum("te3ch4nocred8its");
	}
}
