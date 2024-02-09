package dharma;

public class RemoveAllDigitEx1 {

	String toGetAllDigit(String input) {
		String str1 = "";
		for(int i = 0;i < input.length(); i++) {
			char ch = input.charAt(i);
			if(!Character.isDigit(ch)) {
				str1 = str1 + ch;
			}
		}
		System.out.println(str1);
		return str1;
	}
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new RemoveAllDigitEx1().toGetAllDigit(str);
	}
}
