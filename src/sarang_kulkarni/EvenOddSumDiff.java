/*Assignment - 34 : 4th Feb'2024

Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68*/
package sarang_kulkarni;

public class EvenOddSumDiff {

	 static int evensum=0,oddsum=0,diff=0;
	 
	void oddevenpostivediff(int[] num) {
		for(int i=0;i<num.length;i++) {
			if(num[i] % 2 ==0) {
				evensum=evensum+num[i];
			}
			else {
				oddsum=oddsum+num[i];
			}
		}
		if(evensum>oddsum) {
			diff=evensum-oddsum;
		}
		else
			diff=oddsum-evensum;
	}
	
	public static void main(String[] args) {
		int [] arr1= {30, 24, 19, 13, 36, 51, 11, 72};
		EvenOddSumDiff sumdiff  = new EvenOddSumDiff();
		sumdiff.oddevenpostivediff(arr1);
		System.out.println("Evensum= "+evensum+" \nOddSum= "+oddsum);
		System.out.println("Positive diff in even odd numbers sum in given array is ="+diff);
	}	
}
