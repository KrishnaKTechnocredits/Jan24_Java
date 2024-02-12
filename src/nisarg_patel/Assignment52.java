package nisarg_patel;

public class Assignment52 {

	int getDigitFromString(String str) {
		String output = "0";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		int ans = Integer.parseInt(output);
		return ans;
	}

	int[] printDigit(String[] str) {
		int[] output = new int[str.length];
		for (int index = 0; index < str.length; index++) {
			output[index] = getDigitFromString(str[index]);
			System.out.print(output[index] + " " );
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		new Assignment52().printDigit(input);
	}
}
