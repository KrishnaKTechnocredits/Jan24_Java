package varsha;

public class StringExample2 {

	void printInfo(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		StringExample2 stringExample2 = new StringExample2();
		stringExample2.printInfo("techno");
	}
}
