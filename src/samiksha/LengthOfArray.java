package samiksha;

public class LengthOfArray {

	void printNamesOfLength5(String[] str) {
		for (int index = 0; index < str.length; index++) {
			char ch = str[index].charAt(0);
			if (str[index].length() > 5 && Character.isUpperCase(ch)) {
				System.out.println(str[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol" };
		new LengthOfArray().printNamesOfLength5(input);
	}
}
