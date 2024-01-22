package garima_s;

class FindDivisible {
	void printDivisible(int start_range, int end_range){
		for(int num =end_range; num >= start_range; num--){
			if(num%7==0) {
				System.out.println(num + " is divisible by 7");
			}
			else if(num%13==0) {
				System.out.println(num +" is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args) {
		FindDivisible finddivisible = new FindDivisible();
		finddivisible.printDivisible(5,40);
	}
}

