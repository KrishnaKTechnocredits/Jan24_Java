package shramika_vaidya;

public class SwapingTwoIntegerWithoutUsingThirdVariable {

	void getIntegerSwapped(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("value of num1->" + num1);
		System.out.println("value of num2->" + num2);
		System.out.println("-----------------------------------");
	}

	void getStringSwapped(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, str2.length() - 1);
		str1 = str1.substring(str2.length());
		System.out.println("Value in str2 is-> " + str2);
		System.out.println("Value in str1 is->" + str1);

	}

	public static void main(String[] args) {
		SwapingTwoIntegerWithoutUsingThirdVariable swapingTwoIntegerWithoutUsingThirdVariable = new SwapingTwoIntegerWithoutUsingThirdVariable();
		swapingTwoIntegerWithoutUsingThirdVariable.getIntegerSwapped(13, 20);
		swapingTwoIntegerWithoutUsingThirdVariable.getStringSwapped("techno", "credits");
	}

}
