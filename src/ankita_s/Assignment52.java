package ankita_s;

public class Assignment52 {

	int DigitsInString(String input) {
		String temp = "0";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				temp = temp + input.charAt(index);
		}
		return Integer.parseInt(temp);
	}

	int[] OutputofString(String[] str) {
		int[] Array = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			Array[i] = DigitsInString(str[i]);
		}
		return Array;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		int arr1[] = new Assignment52().OutputofString(arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(+arr1[i] + " ");
		}
	}
}
