package dharma;

public class PrimeNumEx1 {

	int count=0;
	int sum=0;
	void isPrimeNumber(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
			flag=false;
			break;
			}
		}
		if(flag==true) {
			count++;
			sum=sum+num;
		}
	}

	void printAllPrimeNum(int startRange, int endRange) {
		for(int i=startRange;i<endRange;i++) {
		isPrimeNumber(i);
		}
		System.out.println("total prime numbers in the given range is : "+ count);
		System.out.println("Sum of all the prime numbers in the given range is : "+ sum);
	}
	public static void main(String[] args) {
		PrimeNumEx1 pnex1 = new PrimeNumEx1();
		pnex1.printAllPrimeNum(50, 100);
	}
}
