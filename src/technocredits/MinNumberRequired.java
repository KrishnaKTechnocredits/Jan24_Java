package technocredits;

public class MinNumberRequired {
	
	void findMinRequiredNumbers() {
		int sum = 0;
		int count = 0;
		int num = 1;
		
		while(sum <= 150) {
			if(num%6 == 0) {
				sum = sum + num;
				count++;
				System.out.println(sum);
			}
			num++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new MinNumberRequired().findMinRequiredNumbers();
	}
}
