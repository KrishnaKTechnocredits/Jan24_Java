package shraddha;

/*Assignment 10: print all even numbers in a user defined range.*/

class FindEvenNo{
	
	void Even(int startRange, int endRange){
		for (int num = startRange; num <= endRange; num++){
			if(num%2 == 0)
			System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		FindEvenNo even = new FindEvenNo();
		System.out.println("Even Nos between 10 and 15 are:");
		even.Even(10,15);
	}
}
