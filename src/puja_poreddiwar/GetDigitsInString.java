package puja_poreddiwar;

public class GetDigitsInString {
	
	int count = 0;

	void findDigitString(String str) {
		for (int index = 0; index < str.length(); index++) {
			boolean flag = Character.isDigit(str.charAt(index));
			if (flag == true) {
				count++;
			}
		}
		System.out.println("Total number of digits in " + str + " are : " + count);
	}
				
	public static void main(String[] args) {
		GetDigitsInString stringInDigtis = new GetDigitsInString();
		stringInDigtis.findDigitString("te3c3hn5o2cre3dits");
	}
}
