package varsha.AssignmentOn10;

/*
 * String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
 * output : {134,56,47,0}
 */

public class ArrayEx18 {

	private int getDigitsForStr(String input) {
		String str = "0";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		return Integer.parseInt(str);
	}

	int[] getDigitArray(String[] input) {
		int[] num = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			num[index] = getDigitsForStr(input[index]);
		}
		return num;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		ArrayEx18 arrayEx18 = new ArrayEx18();
		int[] str = arrayEx18.getDigitArray(arr);
		for (int index = 0; index < str.length; index++) {
		}
		System.out.print("{" + str[0] + ", " + str[1] + ", " + str[2] + ", " + str[3] + "}");
	}

}
