//WAP to find out how many digits are there in given string. 
//input : te3c3hn5o2cre3dits

package shridhar_k;

public class Assignment22 {

	void findDigits(String input) {
		int num = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag)
				num++;
		}
		System.out.println("Output: " + num);
	}

	public static void main(String[] arg) {
		String inputString = "te3c3hn5o2cre3dits";
		new Assignment22().findDigits(inputString);
	}
}
