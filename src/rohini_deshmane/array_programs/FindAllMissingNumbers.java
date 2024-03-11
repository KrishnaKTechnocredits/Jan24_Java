package rohini_deshmane.array_programs;
/*
 * Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 

 */
public class FindAllMissingNumbers {
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
		for(int i=0; i<arr.length; i++) {
			isPresent = isNumberPresent(arr, i+1);
			if(isPresent==false) 
				System.out.println(i+1);
		}
		
	}
	
	public static void main(String[] args) {
		int[] x = {2,4,1,5,6,9,8,10};
		FindAllMissingNumbers allMissingNumbers = new FindAllMissingNumbers();
		allMissingNumbers.findMissingNumber(x);
	}
}
