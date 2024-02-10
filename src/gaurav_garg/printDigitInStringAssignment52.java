/*
 WAP to print all digits from given String . convert string to integer.
String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}
 */

package gaurav_garg;

public class printDigitInStringAssignment52 {

	int getdigitfromString(String arr) {
		String newstring = "";
		for (int index = 0; index < arr.length(); index++) {
			char char1 = arr.charAt(index);
			if (Character.isDigit(char1)) {
				newstring = newstring + char1;
			}
		}
		if (newstring.isEmpty())
			return 0;
		else {
			int digit = Integer.parseInt(newstring);
			return digit;
		}

	}

	void printDigitinStringWord(String[] arr) {
		int intarr[] = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			intarr[index] = getdigitfromString(arr[index]);
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.println(intarr[index]);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		new printDigitInStringAssignment52().printDigitinStringWord(arr);
	}
}
