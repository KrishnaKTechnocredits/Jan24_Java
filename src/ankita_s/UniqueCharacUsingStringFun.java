package ankita_s;

public class UniqueCharacUsingStringFun {

	void printUniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		UniqueCharacUsingStringFun uniqueCharacUsingStringFun = new UniqueCharacUsingStringFun();
		System.out.print("Output is:- ");
		uniqueCharacUsingStringFun.printUniqueChar("technocredits");
	}
}
