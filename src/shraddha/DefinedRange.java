package shraddha;

/*Assignment 13:On user defined range print last number which is divisible by 5 & 9.*/

class DefinedRange {
	int last;
	void range(int startRange, int endRange){
		for(int num = startRange; num < endRange ; num++){
			if(num % 5 == 0 && num % 9 == 0){
			last = num;
			}
		}
		System.out.println("Last number divisible by 5 & 9 is " + last);
	}
	
	public static void main(String[] args){
		DefinedRange definedRange = new DefinedRange();
		definedRange.range(5,100);
	}
}
