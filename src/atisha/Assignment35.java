//return the sum of even index..
package atisha;

public class Assignment35 {

	int getSumOfEven(int[]arr) {
		int evensum  = 0;
		for(int index=0;index<arr.length; index++) {
			if (arr[index]%2 == 0) {
				evensum=evensum+arr[index];
				
			}
			
		}
		
		
		return evensum;
		
	}
	public static void main(String[] args) {
		int[]arr = {3,6,9,11,15,20,4,26};
		System.out.println(new Assignment35().getSumOfEven(arr));
	
}
}