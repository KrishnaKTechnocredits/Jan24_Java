package aanand;

public class Assignment39 {
	void printNameMoreThan5Length(String[] name) {
		String str;
		for (int i = 0; i < name.length; i++) {
			str = name[i];
			char ch = str.charAt(0);
			if (name[i].length() > 5 && Character.isUpperCase(ch)) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] name = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		Assignment39 assignment39 = new Assignment39();
		assignment39.printNameMoreThan5Length(name);
	}
}