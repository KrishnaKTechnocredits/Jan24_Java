package ankita_s;

public class Assignment48Array {

	void printdigit(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
				temp = temp + ch;
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Assignment48Array as48 = new Assignment48Array();
		as48.printdigit("Aas-H3v7i");
	}
}