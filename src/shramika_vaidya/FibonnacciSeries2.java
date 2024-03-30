package shramika_vaidya;

//96-2
public class FibonnacciSeries2 {

	void getFibonacciSeries() {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		while (num1 < 100) {
			temp = num1 + num2;
			System.out.print(num1 + ",");
			num1 = num2;
			num2 = temp;
		}
	}

	public static void main(String[] args) {
		new FibonnacciSeries2().getFibonacciSeries();
	}
}
