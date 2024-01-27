/* Assignment 21
 * Find minimum numbers(Which are divisible by 6) required whose sum is >=50*/

package sarang_kulkarni;

public class MinNumbers {
	
	static int sum=0,count=0,num=1;
	void MinNumbers1(){
		while(sum<50) {
			if(num % 6 == 0) {
				sum=sum + num;
				count++;
				System.out.println(num);
			}
			num++;
		}	
	}
		
	public static void main(String[] args) {
		MinNumbers MinNumbers = new MinNumbers();
		System.out.println("Total minimum numbers required whose sum is >=50 \n");
		MinNumbers.MinNumbers1();
		System.out.println("\nTotal minimum numbers required are "+count);
	}	
	

}
