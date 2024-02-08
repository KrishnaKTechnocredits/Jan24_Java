package varsha.AssignmentOn4;

//Print all the names from given array which should start with vowel and atleast have one digit.
//
//input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
//output : Aas3hvi
//       I2sh4a4n
//       Var2sha

public class ArrayEx10 {

	String getAllTheStrFirstCharConsonantAndHaveDigit(String input) {
		String name = "";
		for (int index = 0; index < input.length(); index++) {
			String str = input.toLowerCase();
			char ch = str.charAt(index);
			if (((str.charAt(0) == 'a') || (str.charAt(0) == 'e') || (str.charAt(0) == 'i') || (str.charAt(0) == 'o')
					|| (str.charAt(0) == 'u')) && Character.isDigit(ch)) {
				name = input;
			}
		}
		return name;
	}

	public static void main(String[] args) {
		String[] str = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		for (int index = 0; index < str.length; index++) {
			String name = str[index];
			String input = new ArrayEx10().getAllTheStrFirstCharConsonantAndHaveDigit(name);
			if (input != "") {
				System.out.println(input);
			}
		}
	}
}
