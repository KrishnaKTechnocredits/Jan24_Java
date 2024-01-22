package garima_s;

class EvenNumbers {
	
	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.printEvenNumbers(10,15);
	}
	
	void printEvenNumbers(int start_range, int end_range){
		for(int num = start_range;num <= end_range; num++){
			if(num%2==0) {
				System.out.println("Even NUmbers are:" + num);
			}
		}
	}	
}
