package shraddha;

/*Assignment 11: On user defined range print all numbers which are divisible by 5 and divisible by 3. */

class DivisibleNumbers{
	void divisible(int startRange, int EndRange){
		for (int num = startRange; num <= EndRange ; num++){
			if(num % 3 == 0 && num % 5 == 0)
			System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
		System.out.println("Divisible by 5 & 3, numbers are: ");
		divisibleNumbers.divisible(5,40);
	}
}