package samiksha;

public class ConsonentVowels {

	void printNames(String[] str) {
		for (int index = 0; index < str.length; index++) {
			str[index] = str[index].toLowerCase();
			char ch = str[index].charAt(0);
			char A = str[index].charAt(str[index].length() - 1);
			if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
					&& (A == 'a' || A == 'e' || A == 'i' || A == 'o' || A == 'u')) {
				System.out.println(str[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		new ConsonentVowels().printNames(input);
	}
}
