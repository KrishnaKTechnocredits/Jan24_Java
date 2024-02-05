package gaurav_garg;

public class PrintNameLeangthGreaterthan5Assignment39 {

	void printNameCharGreaterthan5withUpperCase(String str[]) {
		for (int i = 0; i < str.length; i++) {

			if (str[i].length() > 5 && Character.isUpperCase(str[i].charAt(0)) == true) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new PrintNameLeangthGreaterthan5Assignment39().printNameCharGreaterthan5withUpperCase(str);
	}
}
