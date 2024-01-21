package prathamesh_tati;

public class DivisibleNumbers {
	
	void numbers(int startRange, int endRange) {
		
		System.out.println("Divisible by 5 & 3, numbers are:");
		
		for(int num1 = startRange; num1 <= endRange; num1++) {
			if(num1 % 5 ==0 && num1 % 3 ==0){
				System.out.println(num1);				
			}
		}
	}

	public static void main(String[] args) {
		DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
		divisibleNumbers.numbers(5, 40);
	}
}