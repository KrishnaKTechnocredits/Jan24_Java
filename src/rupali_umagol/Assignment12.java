package rupali_umagol;

public class Assignment12 {
	
	void divisibleResult(int startRange, int endRange) {
		for(int num=endRange ; num>startRange ; num--)
			if(num%7==0)
				System.out.println(num + " is divisible by 7");
			else if(num%13==0)
				System.out.println(num + " is divisible by 13");
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12=new Assignment12();
		System.out.println("Divisible by 7 or 13, numbers are:");
		assignment12.divisibleResult(5, 40);
	}

}
