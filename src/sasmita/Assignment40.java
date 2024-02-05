package sasmita;

public class Assignment40 {

	void printNmaes(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String input = str[index].toLowerCase();
			if (!input.startsWith("a") && !input.startsWith("e") && !input.startsWith("i") && !input.startsWith("o")
					&& !input.startsWith("u")) {
				if (input.endsWith("a") || input.endsWith("e") || input.endsWith("i") || input.endsWith("o")
						|| input.endsWith("u")) {
				}
				System.out.println(str[index]);
			}

		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		new Assignment40().printNmaes(arr);
	}
}
