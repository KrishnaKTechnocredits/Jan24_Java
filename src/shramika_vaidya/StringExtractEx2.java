package shramika_vaidya;

public class StringExtractEx2 {

	void getStringExtract(String str) {
		String str3 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
				str3 = str3 + ch;
			}
		}
		System.out.println(str3);
	}

	public static void main(String[] args) {
		new StringExtractEx2().getStringExtract("AasH3v7i");
	}
}
