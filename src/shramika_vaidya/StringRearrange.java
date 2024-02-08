package shramika_vaidya;

public class StringRearrange {

	String getStringRearranged(String str) {
		String digitStr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
			} else if (Character.isUpperCase(ch)) {
				upperCaseStr = upperCaseStr + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseStr = lowerCaseStr + ch;
			}
		}
		String ans = digitStr + upperCaseStr + lowerCaseStr;
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		StringRearrange stringRearrange = new StringRearrange();
		stringRearrange.getStringRearranged("AasH3v7i");
	}
}
