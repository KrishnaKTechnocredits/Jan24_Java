package akshay_gaikwad;

public class LastNumDivisibleBy5And9 {
	void lastNumDivisibleBy5and9(int startNum, int lastNum) {
		for (int index = lastNum ; index > startNum ; index--) {
			if (index%5 == 0 && index%9 == 0) {
				System.out.println("Last number divisible by 5 & 9 is " + index);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		LastNumDivisibleBy5And9 lastnumdivisibleby5and9 = new LastNumDivisibleBy5And9();
		lastnumdivisibleby5and9.lastNumDivisibleBy5and9(5 ,100);
	}
}

