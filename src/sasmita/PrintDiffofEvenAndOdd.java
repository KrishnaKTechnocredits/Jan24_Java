package sasmita;

public class PrintDiffofEvenAndOdd {
	void diffOfEvenandOdd(String str) {
		int oddsum = 0;
		int evensum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int charV = Character.getNumericValue(ch);
				if (charV % 2 == 0) {
					evensum += charV;
				} else {
					oddsum += charV;
				}
			}

		}
		if (oddsum > evensum) {
			System.out.println("Difference beetween odd and even digit in" + str + " is: " + (oddsum - evensum));
		} else {
			System.out.println("Difference beetween even and odd digit in" + str + " is: " + (evensum - oddsum));
		}
	}

	public static void main(String[] args) {
		PrintDiffofEvenAndOdd printdiffevenandodd = new PrintDiffofEvenAndOdd();
		printdiffevenandodd.diffOfEvenandOdd("te3ch4noc7re9d8its");
	}

}