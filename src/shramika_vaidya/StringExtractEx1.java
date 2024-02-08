package shramika_vaidya;

public class StringExtractEx1 {

	void getStringExtract(String str) {
		String str3 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)
					|| (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isDigit(ch))) {
				str3 = str3 + ch;
			}
		}
		System.out.println(str3);
	}

	public static void main(String[] args) {
		new StringExtractEx1().getStringExtract("Aas-H3v7i");
	}
}
