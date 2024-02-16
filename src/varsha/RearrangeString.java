package varsha;

//Print the string by placing special characters at the end
//input: -AasH?3v7i!
//output: AasH37i-?!

public class RearrangeString {

	String getRearrangeString(String input) {
		String alpa = "";
		String special = "";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch)) {
				alpa = alpa + ch;
			} else {
				special = special + ch;
			}
		}
		output = alpa + special;
		return output;
	}

	public static void main(String[] args) {
		String output = new RearrangeString().getRearrangeString("-AasH?3v7i!");
		System.out.println(output);
	}
}
