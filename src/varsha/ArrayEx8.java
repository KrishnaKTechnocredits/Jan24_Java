package varsha;

public class ArrayEx8 {
	void printString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			char ch = str.charAt(0);
			if (str.length() > 5 && Character.isUpperCase(ch)) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] str = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new ArrayEx8().printString(str);
	}
}
