package rohini_deshmane.array_programs;
/*
 * Program 2 : Find out last missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 7
 */
public class MissingLastNumberFromArray {
	boolean isNumberPresent(int[] arr, int num) {
		boolean isPresent = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				isPresent=true;
			}
		}
		return isPresent;
	}
	
	void findMissingNumber(int[] arr) {
		boolean isPresent = true;
		int missingNumber=0;
		for(int i=0; i<arr.length; i++) {
			isPresent = isNumberPresent(arr, i+1);
			if(isPresent==false) 
				missingNumber =i+1;
		}
		System.out.println(missingNumber);
	}
	
	public static void main(String[] args) {
		int[] x = {2,4,1,5,6,9,8,10};
		MissingLastNumberFromArray lastMissingNumber = new MissingLastNumberFromArray();
		lastMissingNumber.findMissingNumber(x);
	}
}
