package shraddha;

/* Assignment - 16 : 21st Jan'2024

On user defined range print sum and average of numbers which is divisible by 5 & 7. */

class Average{

	void sum(int startIndex, int endIndex){
		int count = 0;
		int sum = 0;
		int average = 0;
		for (int num = startIndex; num <= endIndex; num++){
			if (num % 5 == 0 && num % 7 == 0){
				System.out.println("Numbers are: " + num);
				count++;
				sum = sum + num;
			}
		}
		average = sum/count;
		System.out.println("Found "+ count +" numbers which are divible by 5 & 7.");
		System.out.println("Sum= "+ sum);
		System.out.println("Average= "+ average);
				
	}
	
	public static void main(String[] args){
		Average average = new Average();
		average.sum(1,110);
		
	}
}



