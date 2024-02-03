package madhura_kulkarni;

public class ProgrammingTest2_1 {
	void findLastEvenNumInString(String var) {
		int num1 = 0;
		for (int i = 0; i < var.length(); i++) {
			char ch = var.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				if (Character.getNumericValue(ch) % 2 == 0) {
					num1 = Character.getNumericValue(ch);
				}
			}

		}
		System.out.println("Last even number in a given string: " + num1);
	}

	public static void main(String[] args) {
		new ProgrammingTest2_1().findLastEvenNumInString("t1e3ch4noc6re7dit8s");

	}

}
