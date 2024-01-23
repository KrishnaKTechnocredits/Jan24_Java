package samiksha;

public class Sum {
	
	int sum;
	
	void printSum(int startR, int endR) {
		for(int num = startR; num <= endR; num++) {
			if(num % 5 ==0 && num % 10 == 0) {
				sum= sum+num;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		s.printSum(10, 50);
	}
}
