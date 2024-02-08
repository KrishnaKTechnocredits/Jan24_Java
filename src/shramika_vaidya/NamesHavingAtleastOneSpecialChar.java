package shramika_vaidya;//43

public class NamesHavingAtleastOneSpecialChar {

	boolean isCharUpperCaseOrLowerCaseOrDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) == false && Character.isLowerCase(ch) == false
					&& Character.isDigit(ch) == false) {
				return true;
			}
		}
		return false;
	}

	void printNamesOfString(String[] names) {
		for (int i = 0; i < names.length; i++) {
			if (isCharUpperCaseOrLowerCaseOrDigit(names[i]) == true) {
				System.out.println(names[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		NamesHavingAtleastOneSpecialChar namesHavingAtleastOneSpecialChar = new NamesHavingAtleastOneSpecialChar();
		namesHavingAtleastOneSpecialChar.printNamesOfString(arr);
	}
}
