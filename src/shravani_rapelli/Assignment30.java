package shravani_rapelli;

public class Assignment30 {
	
	int sum=0;
	int count = 0;
	
	void isPrimeNum(int num) {
		boolean flag = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag==true) {
			sum = sum + num;
			count++;
		}
	}
	
	void printSumOfAllNumbers(int startRange,int endRange) {
		for(int num=startRange; num<=endRange; num++) {
			isPrimeNum(num);
		}
		System.out.println("Total prime numbers in the given range: "+ count);
		System.out.println("Sum of all prime numbers in the given range:"+ sum);
	}
	
	public static void main(String[] args) {
		new Assignment30().printSumOfAllNumbers(50,100);
	}

}
