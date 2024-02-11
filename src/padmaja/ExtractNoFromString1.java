/*Assignment - 52 : 10th Feb'2024

String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}
*/

package padmaja;

public class ExtractNoFromString1 {

	int[] getIntArray(String[] inputarr) {
		int outputarr[] = new int[inputarr.length];
		for (int i = 0; i < inputarr.length; i++) {
			String str = inputarr[i];
			int digits = getIntFromString(str);
			outputarr[i] = digits;
		}
		return outputarr;
	}

	int getIntFromString(String str) {
		String temp = "0";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		int tempInteger = Integer.parseInt(temp);
		return tempInteger;
	}

	void displayintArry(int[] numArry) {
		for (int i = 0; i < numArry.length; i++) {
			System.out.print(numArry[i] + " ");
		}
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		ExtractNoFromString1 extractNoFromString1 = new ExtractNoFromString1();
		int[] newintarr = extractNoFromString1.getIntArray(arr);
		extractNoFromString1.displayintArry(newintarr);
	}
}
