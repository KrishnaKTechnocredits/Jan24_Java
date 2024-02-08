/* Assignment 32
 * Print the array elements in reverse order
 * Array Input: 10,20,30,40,50
 * Output: 50,40,30,20,10
 */

package sarang_kulkarni;

public class ReverseArr {
	
	void reversearr(int[] num) {
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(" "+num[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		ReverseArr reverseArr  = new ReverseArr();
		reverseArr.reversearr(arr);
	}

}
