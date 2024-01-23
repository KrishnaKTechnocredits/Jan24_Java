package suresh;

public class NameType {
	void m1(String input, char value) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ans = input.charAt(i);
			if (ans == value)
				count = count + 1;
		}
		System.out.println("frequency of t in technocredits is " + count);
	}

	public static void main(String[] args) {
		NameType nameType = new NameType();
		nameType.m1("technocredits", 't');

	}
}
