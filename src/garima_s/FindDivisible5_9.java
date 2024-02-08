package garima_s;

public class FindDivisible5_9 {
	void printDivisible(int start_range, int end_range){
		for(int num =end_range; num >= start_range; num--){
			if(num%5==0 && num%9==0) {
				System.out.println("Last Number divisible by 5 and 9 : " + num);
				break;
			}		
		}
	}
	
	public static void main(String[] args) {
		FindDivisible5_9 findDivisible5_9 = new FindDivisible5_9();
		findDivisible5_9.printDivisible(5,100);
	}
}
