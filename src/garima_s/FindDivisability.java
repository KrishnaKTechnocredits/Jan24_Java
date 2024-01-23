package garima_s;

class FindDivisability {
	public static void main(String[] args) {
		FindDivisability findDivisability = new FindDivisability();
		findDivisability.printDiv(5,40);
		}
	
	void printDiv(int start_range, int end_range) {
		for(int number=start_range;number <= end_range; number++){
			if(number%3==0 && number%5==0) {
				System.out.println("Divisable by 3 and 5 numbers are:" +number);
			}
		}
	}
}