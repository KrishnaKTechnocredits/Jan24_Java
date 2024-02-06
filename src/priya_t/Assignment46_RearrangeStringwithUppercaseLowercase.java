package priya_t;

public class Assignment46_RearrangeStringwithUppercaseLowercase {

	void getrearrangeChar(String arr[]) {
		String Digit = "";
		String UpperCase = "";
		String LowerCase = "";
        for (int index = 0; index < arr.length; index++) {
			String Str = arr[index];
			for (int index1 = 0; index1 < Str.length(); index1++) {
				char ch = Str.charAt(index1);
				if (Character.isDigit(ch))
					Digit = Digit + ch;
				else if (Character.isUpperCase(ch))
					UpperCase = UpperCase + ch;
				else if (Character.isLowerCase(ch))
					LowerCase = LowerCase + ch;
			}
			String ModifiedString = Digit + UpperCase + LowerCase;
			System.out.println(ModifiedString);
        }
     }

	public static void main(String[] args) {
		Assignment46_RearrangeStringwithUppercaseLowercase arrageDigitUperLowr = new Assignment46_RearrangeStringwithUppercaseLowercase();
		String arr[] = { "AasH3v7i" };
		arrageDigitUperLowr.getrearrangeChar(arr);
	}
}
