package hiral_purohit;
//"Print the string by placing special characters at the end

public class Assignment_64 {

	void toGetSplCharAtEnd(String str) {
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch) && !Character.isLowerCase(ch) && !Character.isUpperCase(ch)) {
				str1 = str1 + ch;
			} else {
				str2 = str2 + ch;
			}
		}
		System.out.println(str2 + str1);
	}

	public static void main(String[] args) {
		new Assignment_64().toGetSplCharAtEnd("-AasH?3v7i!");
	}

}
