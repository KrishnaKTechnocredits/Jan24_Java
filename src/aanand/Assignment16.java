package aanand;

public class Assignment16 {
	void  divisibleBy5And7(int startIndex, int endIndex) {
		int count = 0;
		int sum = 0;
		System.out.println("Numbers are: ");
		for(int num = startIndex; num<= endIndex; num++) {
			if(num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				count++;
				System.out.println(num);
			}
		}
		System.out.println("Found " + count +" numbers which are divisible by 5 and 7.");
		System.out.println("Sum = " +sum);
		System.out.println("Average = " + sum/count);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.divisibleBy5And7(1, 110);
	}
}
