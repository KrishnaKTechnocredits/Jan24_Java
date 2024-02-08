/*Assignment - 36 : 4th Feb'2024

Return the sum of all the numbers which are divisible by 3 or 5.

input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126

Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both : 15+30 = 45*/
package sarang_kulkarni;

public class SumOfNumbersDivBy3Or5 {
	static int sum =0;
	void sumofnumbersdivby3or5(int[]num) {
		for(int i=0;i<num.length;i++) {
			
			if(num[i] % 3 == 0 || num[i] % 5 ==0) {
				sum=sum+num[i];
			}
		}
		System.out.println("Sum of numbers divisible by 3 and 5 = "+sum);
	}
	
	public static void main(String[] args) {
		int[] arr= {6, 5, 3, 15, 19, 40, 30, 27, 11};
		new SumOfNumbersDivBy3Or5().sumofnumbersdivby3or5(arr);
	}
}
