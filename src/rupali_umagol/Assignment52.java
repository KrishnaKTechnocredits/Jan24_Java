//Extract All digits from String and insert into Array.
package rupali_umagol;

public class Assignment52 {

	int getDigitFromString(String input) {
		String temp = "0";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		return Integer.parseInt(temp);
	}

	int[] allDigitArray(String[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = getDigitFromString(arr[i]);
		}
		return arr1;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		int[] result = new Assignment52().allDigitArray(arr);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}
