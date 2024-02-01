package shramika_vaidya;

class StringRemoveUpperCase {

	void removeUpperCaseChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean isflag = Character.isUpperCase(ch);
			if (isflag == true) {
				String upperCaseLetter = String.valueOf(ch);
				str = str.replace(upperCaseLetter, "*");
			}
		}
		String strng = str.replace("*", "");
		System.out.println(strng);
	}

	public static void main(String[] args) {
		new StringRemoveUpperCase().removeUpperCaseChar("TechNoCREdits");
	}
}
