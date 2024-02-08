package technocredits;

public class EvenOdd {
	
	static int output = 100;
	int ans = 200;
	
	boolean isNumEven(int num) {
		if(num%2==0) {
			System.out.println(num + " is even");
			return true;
		}else {
			System.out.println(num + " is odd");
			return false;
		}
	}
	
	static void getCharFreq(){
		EvenOdd obj1 = new EvenOdd();
		obj1.isNumEven(14);
	}
	
	public static void main(String[] args) {
		EvenOdd obj1 = new EvenOdd();
	}
}
