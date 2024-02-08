
/*Assignment - 38 : 4th Feb'2024

Return the max & min number from given array.

input : [10,20,50,60,30]
output : min : 10 max : 60*/

package sarang_kulkarni;

public class ReturnMimMaxNumber {
	
	void returnMinMaxNumber(int[] num) {
		int max=num[0];
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}		
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Max Number ="+max+"\nMin Number= "+min);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,50,60,30};
		new ReturnMimMaxNumber().returnMinMaxNumber(arr);
		
		
	}

}
