package akshada_marne;

public class PrimeNumbers {
	
	void check(int start, int end) {
	    for(int num=10; num<=15; num++) {
		if(num%2==0)
			System.out.println(num+ " is even number");
	    }
	}
	
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.check(10,15);

	}

}
