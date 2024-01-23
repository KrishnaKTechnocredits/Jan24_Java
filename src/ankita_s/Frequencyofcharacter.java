package ankita_s;

public class Frequencyofcharacter {

	void charfreq(String input, char target) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char x = input.charAt(index);
			if (x == target)
				count++;
		}
		System.out.println(" frequency of t in technocredits is  " + count);
	}

	public static void main(String[] args) {
		Frequencyofcharacter frequencystr = new Frequencyofcharacter();
		frequencystr.charfreq("techocredits", 't');
	}
}