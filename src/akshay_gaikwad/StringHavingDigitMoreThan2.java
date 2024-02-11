package akshay_gaikwad;

public class StringHavingDigitMoreThan2 {
	void printStringHavingDigitMoreThan2(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int count = getFreqOfDigitsInString(arr[index]);
			if (count > 1) {
				System.out.println(arr[index]);
			}
		}
	}

	int getFreqOfDigitsInString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new StringHavingDigitMoreThan2().printStringHavingDigitMoreThan2(arr);
	}
}
