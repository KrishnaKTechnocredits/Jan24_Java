package shramika_vaidya;

//96part1
public class PrintFibonnacciSeries {

	void printFibonacciSeries(int nthNum) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + "," + num2);
		for (int i = 3; i <= nthNum; i++) {
			int temp = num1 + num2;
			System.out.print("," + temp);
			num1 = num2;
			num2 = temp;
		}
	}

	public static void main(String[] args) {
		new PrintFibonnacciSeries().printFibonacciSeries(10);
	}
}
