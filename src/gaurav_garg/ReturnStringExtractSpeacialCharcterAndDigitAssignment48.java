package gaurav_garg;

public class ReturnStringExtractSpeacialCharcterAndDigitAssignment48 {

	void rearrangeStringSpeacialcharacterDigit(String str) {
		String speacialChacterStr = "";
		String digitStr = "";
		for (int stringindex = 0; stringindex < str.length(); stringindex++) {
			char c = str.charAt(stringindex);
			if (Character.isDigit(c) == true)
				digitStr = digitStr + c;
			else if (Character.isLowerCase(c) == false && Character.isUpperCase(c) == false)
				speacialChacterStr = speacialChacterStr + c;
		}
		System.out.print(speacialChacterStr + digitStr);
	}

	public static void main(String[] args) {
		new ReturnStringExtractSpeacialCharcterAndDigitAssignment48()
				.rearrangeStringSpeacialcharacterDigit("Aas-H3v7i");
	}
}
