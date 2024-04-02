package nikita_patil;

public class Assignment27 {
	
	void removeUpperChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				input = input.replace(ch, '*');
			}
		}
		//System.out.println(input);
		input = input.replace("*", "");
		System.out.println(input);

	}

	public static void main(String[] args) {
	Assignment27 a = new Assignment27();
			a.removeUpperChar("TechNoCREdits");
	}
}


