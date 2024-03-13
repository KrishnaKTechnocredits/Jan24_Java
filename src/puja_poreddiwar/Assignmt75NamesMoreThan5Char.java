package puja_poreddiwar;

public class Assignmt75NamesMoreThan5Char {

	boolean isNameContainDigit(String name) {
		for (int i = 0; i< name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printName(String[] arr) {
		for (String name : arr) {
			char lastChar = name.charAt(name.length() - 1);
			boolean flag = isNameContainDigit(name);
			if (name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && flag == false) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new Assignmt75NamesMoreThan5Char().printName(arr);

	}

}
