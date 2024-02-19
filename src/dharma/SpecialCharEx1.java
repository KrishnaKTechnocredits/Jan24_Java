package dharma;

public class SpecialCharEx1 {

	void isSpecialChar(String str) {
		String str1 = "";
		String str2 = "";
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
				str1 = str1 + str.charAt(i);
			}else {
				str2 = str2 + str.charAt(i);
			}
		}
		System.out.println(str1 + str2);
	}
	
	public static void main(String[] args) {
		new SpecialCharEx1().isSpecialChar("-AasH?3v7i!");
	}

}
