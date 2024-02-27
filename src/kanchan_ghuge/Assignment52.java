/*String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}  */

package kanchan_ghuge;

class Assignment52 {

	int extractDigitFromString(String str) {
		String temp = "0";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
		}
		return Integer.parseInt(temp);
	}

	int[] getOutputString(String[] str) {
		int[] array = new int[str.length];
		for (int index = 0; index < str.length; index++) {
			array[index] = extractDigitFromString(str[index]);
		}
		return array;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		int str1[] = new Assignment52().getOutputString(arr);
		System.out.println("Output String After extracting digits from it = ");
		for (int index = 0; index < str1.length; index++) {
			System.out.println(str1[index] + " ");
		}
	}
}
