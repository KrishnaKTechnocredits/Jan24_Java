package aanand;

public class ProgrammingTest2 {

	void lastUniqConsOfString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
					System.out.println(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		ProgrammingTest2 programmingTest2 = new ProgrammingTest2();
		programmingTest2.lastUniqConsOfString("aakansha");
	}
}