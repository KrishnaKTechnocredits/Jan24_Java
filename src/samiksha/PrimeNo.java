package samiksha;

public class PrimeNo {
	int sum = 0;
	int count=0;
	
	
	void findPrimeNum(int num) {
		boolean flag = true;
		for (int index = 2; index <num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		} if (flag == true) {
			System.out.println(num + " is prime.");
		    count++;
		    sum = sum + num;
		}
		//System.out.println("total prime numbers are " + count);
		
	}

	void printAllPrimeNo(int startR, int endR) {
		for (int num = startR; num <= endR; num++) {
			findPrimeNum(num);
		}
		
		System.out.println("sum of prime numbers is " + sum);
		System.out.println("total prime numbers are " + count);
     
	}

	public static void main(String[] args) {
		PrimeNo primeNo = new PrimeNo();
		primeNo.printAllPrimeNo(50, 100);
		
	}

}
