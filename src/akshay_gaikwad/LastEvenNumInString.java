package akshay_gaikwad;

public class LastEvenNumInString {
	int getLastEvenNum(String input) {
		int evenNum = -1;
		for (int index = (input.length() - 1); index >= 0; index--) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int value = Character.getNumericValue(ch);
				if (value % 2 == 0) {
					evenNum = value;
					return evenNum;
				}
			}
		}
		if (evenNum == -1) {
			System.out.print("No even number found in string ");
			return evenNum;
		} else {
			return evenNum;
		}
	}

	public static void main(String[] args) {
		System.out.println(new LastEvenNumInString().getLastEvenNum("Te5ch2no4cr5edit8s7"));
	}
}
