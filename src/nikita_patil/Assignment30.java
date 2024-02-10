package nikita_patil;

public class Assignment30 {

	
	int sum = 0;
	int count = 0;

	void NumPrime(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				// System.out.println(number + " : is not a prime number");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			sum = sum + number;
			count++;
			System.out.println(number + " : is a prime number");
		}
	}

	void printAllPrimeNum(int startRng, int endRng) {
		for (int i = startRng; i <= endRng; i++) {
			NumPrime(i);
		}
		System.out.println(sum + " : sum of all the prime number");
		System.out.println("Total prime number in the given range are : " + count);

	}

	public static void main(String[] args) {
		Assignment30 a  = new Assignment30();
		a.printAllPrimeNum(50, 100);
	}

}

