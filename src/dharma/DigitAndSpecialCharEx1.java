package dharma;

public class DigitAndSpecialCharEx1 {

	void addDigitSpecial(String name) {
		String str = " ";
		for(int i = 0;i < name.length(); i++) {
			char ch = name.charAt(i);
			if(!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		new DigitAndSpecialCharEx1().addDigitSpecial("Aas-H3v7i");
	}
}
