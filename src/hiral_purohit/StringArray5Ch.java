package hiral_purohit;

public class StringArray5Ch {

	void printString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > 5 && Character.isUpperCase(input[index].charAt(0))) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		StringArray5Ch stringArray5Ch = new StringArray5Ch();
		stringArray5Ch.printString(arr);
	}

}
