package technocredits;

public class Client {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.add(10, 20);
		calc.sub(10, 20);
		
		EvenOdd evenOdd = new EvenOdd();
		boolean	numFlag = evenOdd.isNumEven(45);
		System.out.println(numFlag);
		
		System.out.println(EvenOdd.output);
	}
}
