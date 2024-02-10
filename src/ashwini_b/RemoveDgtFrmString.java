package ashwini_b;
/*
Assignment - 51 : 9th Feb'2024
WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune
 */
public class RemoveDgtFrmString {
	void removeDigit(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			String str = "";
			if (!Character.isDigit(ch)) {
				str = str + ch;
			}
			System.out.print(str);
		}
	}

	public static void main(String[] args) {
		RemoveDgtFrmString removeDgtFrmString = new RemoveDgtFrmString();
		removeDgtFrmString.removeDigit("H2i H3el4lo P4un2e5");
	}
}

