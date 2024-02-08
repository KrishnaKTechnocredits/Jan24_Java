package ashwini_b;

/*
Assignment - 39 : 4th Feb'2024
Print all the names from given array having length more than 5 characters and
 should start with upper case.
input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"}
Output ; Aashvi
		 Sameer
		 Techno
 */
public class ArrayName {

	void printName(String[] strArray) {
		for (int i = 0; i < strArray.length; i++) {
			String str = strArray[i];
			if (str.length() > 5) {
				char firstch = str.charAt(0);
				if (Character.isUpperCase(firstch)) {
					System.out.println(str);
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] Inputarry = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		ArrayName arrayName = new ArrayName();
		arrayName.printName(Inputarry);
	}
}
