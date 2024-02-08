package phenol_verma;

public class ArrFindLastNonNumericChar {

	void nonNumricChar(String arr[]) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			//for (int charIndex = 0; charIndex < str.length(); charIndex++) {
				char ch = str.charAt(str.length()-1);
				if (Character.isDigit(ch))
					System.out.println(str.charAt(str.length()-2));
				else
					System.out.println(str.charAt(str.length()-1));
			}
		}

	

	public static void main(String[] args) {
		ArrFindLastNonNumericChar arrFindLastNonNumericChar = new ArrFindLastNonNumericChar();
		String arr[] = { "Phenol17", "Neha2", "Lalit", "Maulik123", "Harsh1", "Ma1r3g4i5" };
		arrFindLastNonNumericChar.nonNumricChar(arr);
	}
}
