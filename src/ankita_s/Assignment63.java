package ankita_s;

public class Assignment63 {

	void stringEmpty(String str) {
		if (str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}

	public static void main(String[] args) {
		String input = "";
		new Assignment63().stringEmpty(input);
	}
}