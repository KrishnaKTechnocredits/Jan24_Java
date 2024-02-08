package ankita_s;

public class Assignment46Array {

	void printString(String str) {
		String temp1 = "", temp2 = "", temp3 = "", ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) == true)
				temp1 = temp1 + ch;
			else if (Character.isLowerCase(ch) == true)
				temp2 = temp2 + ch;
			else if (Character.isDigit(ch) == true)
				temp3 = temp3 + ch;
		}
		ans = temp3 + temp1 + temp2;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Assignment46Array ass46 = new Assignment46Array();
		ass46.printString("AasH3v7i");
	}
}
