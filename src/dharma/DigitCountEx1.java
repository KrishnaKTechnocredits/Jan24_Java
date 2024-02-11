package dharma;

public class DigitCountEx1 {

	String toGetDigitCount(String input) {
		int count = 0;
		for(int i = 0;i < input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch))
				count++;
		}
		System.out.println(count);
		return input;
	}
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new DigitCountEx1().toGetDigitCount(str);
	}
}
