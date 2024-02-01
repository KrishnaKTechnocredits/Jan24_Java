/* Assignment - 30 : 1st Feb'2024
Print all the prime numbers in the give range, and print sum of all the primeNumbers.
input : 50 -> 100
output : total prime numbers in the given range is xx
         Sum of all the prime numbers in the given range is yy*/
package sveta;

public class Assignment_30_PrimeNo {
	static int count;
	public static int isPrimeNo(int num) {
		int input=0;
		boolean flag = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
			
		}
		if(flag==true) {
			count++;
			input=num;
		}
		return input;
	}
	
	public  void sumOfPrime(int start, int end) {
		int sum = 0;
		for(int no=start;no<=end;no++) 
			sum +=isPrimeNo(no);
		System.out.println("Total Number Of Prime In Range Is -> "+count);
		System.out.println("Sum of Prime No is -> "+sum); 
	}
	
	public static void main(String []args) {
		Assignment_30_PrimeNo prime = new Assignment_30_PrimeNo();
		prime.sumOfPrime(50,100);
	}
	
	
	
	

//	public static int isNum(int num) {
//		int sum = 0;
//		boolean flag= true;
//		for(int i=2; i<=num; i++) {
//			if(num%i==0) {
//				System.out.println(num +" is No prime");
//				flag=false;
//				//sum +=num;
//				break;
//			}
//			if(flag==true) {
//				System.out.println(num +"is prime No");
//				sum+=num;
//				System.out.println("sum is "+sum);
//			}
//		}
//		
//		return sum;
//	}
//	
//	public static void sumOfPrime(int start, int end) {
//		int sum=0;
//		for(int i=start;i<end;i++){
//			sum +=isNum(i);
//		}
//		System.out.println("sum is "+sum);
//	}
//	
//	public static void main(String[] args) {
//		sumOfPrime(50,100);
	//}

}
