package sasmita;

public class Assignment39 {

	void StartwithUppercase(String[] str) {
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() > 5 && Character.isUpperCase(str[index].charAt(0))) {
				System.out.println(str[index]);
			}
		}

	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new Assignment39().StartwithUppercase(arr);

	}
}
