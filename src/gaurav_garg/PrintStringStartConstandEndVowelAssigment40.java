package gaurav_garg;

public class PrintStringStartConstandEndVowelAssigment40 {

	void printStringwithStartConstantEndVowel(String str[]) {
		for (int i = 0; i < str.length; i++) {
			char start = str[i].toUpperCase().charAt(0);
			char end = str[i].toUpperCase().charAt(str[i].length() - 1);
			if (start != 'A' && start != 'E' && start != 'I' && start != 'O' && start != 'U') {
				if (end == 'A' || end == 'E' || end == 'I' || end == 'O' || end == 'U') {
					System.out.println(str[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		new PrintStringStartConstandEndVowelAssigment40().printStringwithStartConstantEndVowel(str);
	}
}
