package shraddha;

/*Return the sum of all the numbers which are divisible by 3 or 5.*/

class DivisibleBy{
	int divisibleNumbers(int[] input){
		int sum=0;
		for(int i=0;i<input.length;i++){
			if(input[i]%3==0 || input[i]%5==0)
				sum=sum+input[i];
		}
		System.out.println("Sum of numbers divisible by 3 or 5 is: "+sum);
		return sum;
	}
	void divisibleNumbers3(int[] input){
		int sum1=0;
		for (int i=0;i<input.length;i++){
			if(input[i]%3==0)
				sum1=sum1+input[i];
		}
		System.out.println("Sumof numbers divisible by 3 is:"+sum1);
	}
	
	void divisibleNumbers5(int[] input){
		int sum2=0;
		for (int i=0;i<input.length;i++){
			if(input[i]%5==0)
				sum2=sum2+input[i];
		}
		System.out.println("Sumof numbers divisible by 5 is:"+sum2);
	}
		
	public static void main(String[] args){
		DivisibleBy divisibleBy = new DivisibleBy();
		int[] input={6, 5, 3, 15, 10, 19, 40, 30, 27, 11};
		divisibleBy.divisibleNumbers(input);
		divisibleBy.divisibleNumbers3(input);
		divisibleBy.divisibleNumbers5(input);
		}
}