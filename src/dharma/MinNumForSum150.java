package dharma;

public class MinNumForSum150 {

int count = 0;
	
	int countNum(int sum, int divsum) {
		int number = 1;
		int sum150 = 0;
		
		while (sum150<=sum) {
			if(number % divsum == 0) {
				sum150 = sum150 + number;
				count++;
				
			}
			number++;
		}
		return count;
	}

 	public static void main(String[] args) {
		MinNumForSum150 minnumforsum150 = new MinNumForSum150();
		int counter = minnumforsum150.countNum(150, 6);
		System.out.println(counter);
		
	}
}

