package ankita_s;

public class Assigment25 {

	void printduplicateChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assigment25 assigment25 = new Assigment25();
		System.out.print("Output is:- ");
		assigment25.printduplicateChar("aakanksha");
	}
}
