package phenol_verma;

public class StringInReverse {

	void string(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.println(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringInReverse stringInReverse = new StringInReverse();
		stringInReverse.string("techno");
	}
}
