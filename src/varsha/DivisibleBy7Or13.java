package varsha;

public class DivisibleBy7Or13 {
	
	void printNumInfo(int start, int end) {
		for (int i=end; i>=start; i--) {
			if(i%7 == 0) {
				System.out.println(i + " : is divisible by 7");
			} else if(i%13 == 0) {
				System.out.println(i + " : is divisible by 13");
			}
		}
	}

	public static void main(String[] args) {
		DivisibleBy7Or13 divisibleBy7Or13= new DivisibleBy7Or13();
		divisibleBy7Or13.printNumInfo(5, 40);
	}
}
