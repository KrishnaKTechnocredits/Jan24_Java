package varsha.AssignmentOn4;

//Print all the names from given array having length more than 5 characters and should start with upper case.
//
//input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"}
//Output ; Aashvi
//		 Sameer
//		 Techno

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
		String[] str = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "phenol" };
		new ArrayEx8().printString(str);
	}
}
