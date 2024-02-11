package shafaque;

public class Assignment48 {

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
		Assignment48 assi48 = new Assignment48();
		assi48.printdigit("Aas-H3v7i");
	}
}
