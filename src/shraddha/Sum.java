package shraddha;

/*Assignment - 14 : 21st Jan'2024
On user defined range print sum of all the number which is divisible by 5 & 10. */

class Sum{
	void printSum(int startRange, int endRange){
		int sum = 0;
		for(int num = startRange; num <= endRange; num++){
			if(num % 5 == 0 && num % 10 == 0)
				sum = sum + num;
			}
		System.out.println("Expected sum is "+ sum);
	}
		
	public static void main(String[] args){
		Sum sum1 = new Sum();
		sum1.printSum(10,50);
	}
}
