package madhura_kulkarni;

public class ProgrammingTest2_2 {

	void findLastConsonemtInString(String var) {
		char lastch = 0;

		for (int i = 0; i < var.length(); i++) {
			char ch1 = var.charAt(i);
			if (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u') {
				lastch = ch1;

			}

		}

		System.out.println("Last consonemt in the string is " + lastch);

	}

	public static void main(String[] args) {
		ProgrammingTest2_2 pr2 = new ProgrammingTest2_2();
		pr2.findLastConsonemtInString("madhurakulkarni");

	}

}
