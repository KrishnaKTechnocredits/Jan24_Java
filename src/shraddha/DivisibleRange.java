/*Assignment 12: On user defined range print all numbers which are divisible by 7 or 13 in reverse order.*/

class DivisibleRange{
	
	void range(int startRange, int endRange){
		for (int num=endRange ; num >= startRange; num--){
			if(num % 7 == 0) {
			System.out.println(num + " is divisible by 7");
			}
			else if(num % 13 == 0) {
			System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleRange divisibleRange = new DivisibleRange();
		divisibleRange.range(5,40);
	}
}