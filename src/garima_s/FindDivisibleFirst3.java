package garima_s;

public class FindDivisibleFirst3 {
	void printDivisible(int start_range, int end_range){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4");
		for(int num =start_range; num <= end_range; num++){
			if(num%3==0 && num%4==0) {
				count++;
				System.out.println(num);
				if(count==3) {
					break;
				}
			}	
		}
	}
	
	public static void main(String[] args){
		FindDivisibleFirst3 findDivisibleFirst3 = new FindDivisibleFirst3();
		findDivisibleFirst3.printDivisible(10,100);
	}
}
