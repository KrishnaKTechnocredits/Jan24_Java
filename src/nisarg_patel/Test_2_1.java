package nisarg_patel;

public class Test_2_1 {

	void freq(String str) {
		str = str.toLowerCase();
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Test_2_1 ce1 = new Test_2_1();
		ce1.freq("nisarg");
	}
}
