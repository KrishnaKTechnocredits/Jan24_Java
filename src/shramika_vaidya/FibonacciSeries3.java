package shramika_vaidya;

public class FibonacciSeries3 {

	void getFibonacciSeries1() {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		while (num1 < 100) {
			if (num1 > 50 && num1 < 100)
				System.out.print(num1 + ",");
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
	}

	public static void main(String[] args) {
		new FibonacciSeries3().getFibonacciSeries1();
	}
}
