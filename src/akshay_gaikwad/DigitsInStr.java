/*String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}*/

package akshay_gaikwad;

public class DigitsInStr {
	private int getDigitsInStr(String str) {
		String digitStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr += ch;
			}
		}
		if (digitStr.isEmpty()) {
			return 0;
		} else {
			return Integer.parseInt(digitStr);
		}
	}

	int[] getDigitsInStrArr(String[] strArr) {
		int[] intArr = new int[strArr.length];
		for (int index = 0; index < strArr.length; index++) {
			intArr[index] = getDigitsInStr(strArr[index]);
		}
		return intArr;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		int[] output = new DigitsInStr().getDigitsInStrArr(arr);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + ", ");
		}
	}
}
