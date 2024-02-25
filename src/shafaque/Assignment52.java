package shafaque;

public class Assignment52 {

	int getNumberFromString(String str) {
		String temp = "0";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		return (Integer.parseInt(temp));

	}

	int[] getNumarray(String[] arr) {
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			output[index] = getNumberFromString(arr[index]);
			System.out.println(output[index]);
		}
		return output;

	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		new Assignment52().getNumarray(arr);

	}

}
