/*Assignment - 35 : 4th Feb'2024

Return the sum of even index [0,2,4,6]

input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 60

hint 6, 20, 4, 26*/

package sarang_kulkarni;

public class EvenIndexSum {
	static int sum =0;
	void evenindexsum(int[]num) {
		for(int i=0;i<num.length;i++) {
			
			if(i % 2 == 0) {
				sum=sum+num[i];
			}
		}
		System.out.println("Sum of numbers at even index oly = "+sum);
	}
	
	public static void main(String[] args) {
		int[] arr= {3, 6, 9, 11, 15, 20, 4, 26};
		new EvenIndexSum().evenindexsum(arr);
	}

}
