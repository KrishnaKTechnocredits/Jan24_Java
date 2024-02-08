package ankita_s;

public class Assignment47Array {

	void printdigit(String str) {
		String digit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				digit = digit + ch;
		}
		System.out.println(digit);
	}

	public static void main(String[] args) {
		Assignment47Array ass47 = new Assignment47Array();
		ass47.printdigit("Aas-H3v7i");
	}
}
