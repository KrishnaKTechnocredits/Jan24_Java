package priya_t;

public class Assignment36_SumDivby3or5 {
	
	
	public void divby3or5(int[] numbers) {
		int sum=0;
		for (int index = 0; index < numbers.length - 1; index++) {
			if (numbers[index] % 3 == 0 && numbers[index] % 5 == 0) { 
				System.out.println(numbers[index] + " is divisible by 3 & 5");
				sum=sum+numbers[index];
			} else if(numbers[index] % 3 == 0) {
			    System.out.println(numbers[index] + " is divisible by 3");
				sum=sum+numbers[index];
			} else if(numbers[index] % 5 == 0) {
				System.out.println(numbers[index] + " is divisible by 5");	
				sum=sum+numbers[index];
		}
		}
		System.out.println("Total sum is " + sum);
		
	}
		
	public static void main(String[] args) {
		int[] numbers = {6, 5, 3, 15, 19, 40, 30, 27, 11};
		Assignment36_SumDivby3or5  division = new Assignment36_SumDivby3or5();
		division.divby3or5(numbers);
	}

}
