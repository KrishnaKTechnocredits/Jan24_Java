package varsha;

public class DivisibleBy5And9 {
	
	void printNumberInfo(int startIndex, int endIndex) {
		int i = 0;
		for(int num=startIndex; num<=endIndex; num++) {
			if(num%5 == 0 && num%9 == 0) {
				i = num;
			}	
		}
		System.out.println(i + " : is divisible by 5 & 9");
	}
	
	public static void main(String[] args) {
		DivisibleBy5And9 divisibleBy5And9 = new DivisibleBy5And9();
		divisibleBy5And9.printNumberInfo(5, 100);
	}

}
