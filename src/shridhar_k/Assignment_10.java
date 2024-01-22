//On user defined range print all numbers which are divisible by 5 and divisible by 3.

package shridhar_k;

public class Assignment_10 {
	void numDivBy5_3(int startNum1, int endNum ){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int i = startNum1; i <= endNum; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("");
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] arg) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.numDivBy5_3(5, 40);
	}
}
