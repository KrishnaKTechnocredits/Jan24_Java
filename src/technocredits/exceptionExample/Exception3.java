package technocredits.exceptionExample;

public class Exception3 {

	void m1() {
		try {
			System.out.println(1);
			int x = 10 / 0;
			System.out.println("credits");
		} finally {
			System.out.println("finally");
		}
		System.out.println("Techno");

	}

	int m1(int x) {

		try {
			int y = 10 / x;
			//return y;
		} catch (NullPointerException ne) {
			//return 20;
		} catch (ArithmeticException ae) {
			//return 30;
		} catch (Exception e) {
			return 40;
		} finally {
			//return 50;
		}
		return 100;
	}

	public static void main(String[] args) {
		int ans = new Exception3().m1(0);
		System.out.println(ans);
	}
}
