package lovekesh_mishra;

class Assignment52 {

	int countDigit(String input) {
		String str = "0";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				str = str + ch;
			}

		}
		return Integer.parseInt(str);

	}

	int[] printCountDigit(String[] input) {
		int[] input1 = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			input1[i] = countDigit(input[i]);
			System.out.println(input1[i]);
		}
		return input1;
	}

	public static void main(String[] args) {
		Assignment52 ans = new Assignment52();
		String[] name = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		ans.printCountDigit(name);
	}

}