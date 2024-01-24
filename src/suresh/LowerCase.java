package suresh;

public class LowerCase {

	void m1(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			 String lower = input.toLowerCase();
			char ans = lower.charAt(i);
			if (ans == 't' ) {

			count = count + 1;
			}

		}

	System.out.println("frequency of t in technocredits is " + count);
	}
	public static void main(String[] args) {
		LowerCase lowerCase = new LowerCase();
		lowerCase.m1("technocrediTs teaches Technology");
	}
}
