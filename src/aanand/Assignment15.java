package aanand;

public class Assignment15 {
	
	void divisibleBy3And4(int startIndex, int endIndex) {
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4: ");
		for(int num = startIndex; num <= endIndex; num++) {
			if(num % 3 == 0 && num % 4 == 0){
				count++;
				System.out.println(num);
				if(count == 3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.divisibleBy3And4(10, 500);
	}
}
