package nisarg_patel;

public class Assignment26Remove {

	void printRemoveVowels(String value) {
		System.out.print("Remove the Vowels from " + value + " : ");
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				value = value.replace(ch, '*');
			}
		}
		String str = String.valueOf('*');
		value = value.replace(str, "");
		System.out.println(value);
	}

	public static void main(String[] args) {
		new Assignment26Remove().printRemoveVowels("technocredits");
	}
}
