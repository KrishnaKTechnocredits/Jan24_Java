package shravani_rapelli;

public class EvenNumbers {
	
	void processEvenNumbers(int startIndex, int endIndex) {
		for(int num = startIndex; num <= endIndex; num++) {
			if(num % 2 == 0)
				System.out.println("Even numbers are:" + num);
		}
	}
	
	public static void main(String[] args) {
		EvenNumbers evenNumber = new EvenNumbers();
		evenNumber.processEvenNumbers(10, 15);
	}

}
