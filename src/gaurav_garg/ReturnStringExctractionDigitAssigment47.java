package gaurav_garg;

public class ReturnStringExctractionDigitAssigment47 {

	String extractionDigitString(String str) {
		String newdigit = " ";
		for (int stringindex = 0; stringindex < str.length(); stringindex++) {
				char c = str.charAt(stringindex);
				if (Character.isDigit(c) == true)
					newdigit = newdigit + c;
			}
		return newdigit;
	}

	public static void main(String[] args) {
		ReturnStringExctractionDigitAssigment47 returnStringExctractionDigitAssigment47 = new ReturnStringExctractionDigitAssigment47();
		String digit = returnStringExctractionDigitAssigment47.extractionDigitString("Aas-H3v7i");
		System.out.print(digit);
	}

}
