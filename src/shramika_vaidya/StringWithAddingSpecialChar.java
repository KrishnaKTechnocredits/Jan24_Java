package shramika_vaidya;

public class StringWithAddingSpecialChar {

	void toGetCount(String str) {
		String str1 = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				count++;
			} else if (Character.isLetter(str.charAt(i))) {
				str1 += str.charAt(i);
			}
		}
		System.out.println(str1 + " -> " + count);
	}

	void toGetCountOfDash(String[] str) {
		for (int i = 0; i < str.length; i++) {
			toGetCount(str[i]);
		}
	}

	public static void main(String[] args) {
		String str = "I__.am___.in_.pune____";
		String[] arr = str.split("\\.");
		new StringWithAddingSpecialChar().toGetCountOfDash(arr);
	}
}
