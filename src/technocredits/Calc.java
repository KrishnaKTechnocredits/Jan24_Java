package technocredits;


public class Calc {

	static void add(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println(ans);
		System.out.println(EvenOdd.output);
	}
	
	void sub(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println(ans);
		EvenOdd evenOdd = new EvenOdd();
		System.out.println(evenOdd.ans);
	}
}
