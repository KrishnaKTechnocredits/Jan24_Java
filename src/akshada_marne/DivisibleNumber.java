package akshada_marne;

public class DivisibleNumber {
	void divide(int start, int end) {
		for (int num=start; num<=end; num++) {
			if(num%3==0 && num%5==0) {
			System.out.println(num+ " is divisible by 3 and 5");
			}
	    }
	}

	public static void main(String args[]) {
		DivisibleNumber divisibleNumber= new DivisibleNumber();
		divisibleNumber.divide(5,40);
	}
}
