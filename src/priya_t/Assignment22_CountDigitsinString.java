package priya_t;

public class Assignment22_CountDigitsinString {

	void printchar(String input) {

		int digits = 0;

		for (int index = 0; index < input.length(); index++)

		{
            if (Character.isDigit(input.charAt(index)))
                digits++;
        }

		System.out.println("Total no. of digits is " + digits);
		}

	public static void main(String[] args) {
		Assignment22_CountDigitsinString countdigit = new Assignment22_CountDigitsinString();
		countdigit.printchar("te3c3hn5o2cre3dits");
	}
}
