//String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
//output : {134,56,47,0}

package hiral_purohit;

public class Hiral_Assignment_52 {

	int toGetNumbersOfString(String input) {
		String str = "0";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		return (Integer.parseInt(str));
	}

	int[] toGetIntegerArray(String[] arr) {
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			output[index] = toGetNumbersOfString(arr[index]);
			System.out.println(output[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		new Hiral_Assignment_52().toGetIntegerArray(arr);
	}
}
