package padmaja;

public class FirstTest {
	void getDigit(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int no = Character.getNumericValue(ch);
				sum = sum + no;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		FirstTest firstTest = new FirstTest();
		firstTest.getDigit("te3ch4nocredi8ts");
		firstTest.getDigit("technocredits");
	}
}
