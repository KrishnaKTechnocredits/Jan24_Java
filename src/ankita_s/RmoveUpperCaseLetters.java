package ankita_s;

public class RmoveUpperCaseLetters {

	void printRmoveUpperCaseLetters(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			{
				if (Character.isUpperCase(ch)) {
					String temp = str.valueOf(ch);
					str = str.replace(temp, "*");
				}
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RmoveUpperCaseLetters rmoveUpperCaseLetters = new RmoveUpperCaseLetters();
		rmoveUpperCaseLetters.printRmoveUpperCaseLetters("TechNoCREdits");
	}
}
