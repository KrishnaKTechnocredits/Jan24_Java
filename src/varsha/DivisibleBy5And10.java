package varsha;

public class DivisibleBy5And10 {
	
	void printInfo(int startIndex, int endIndex) {
		int sum = 0;
		for(int num=startIndex; num<=endIndex; num++) {
			if(num%5 == 0 && num%10 == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum + " : Sum of number divisible by 5 & 10");
	}
	
	public static void main(String[] args) {
		DivisibleBy5And10 divisibleBy5And10 = new DivisibleBy5And10();
		divisibleBy5And10.printInfo(10, 50);
	}
}
