package rohini_deshmane.array_programs;
/*
 Print numbers present uniquely from array using Array. 
 */
public class UniqueNumberFromArray {

	int getPresentCount(int arr[], int num) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		return count;
	}
	
	void printUniqueFromArray(int arr[]) {
		System.out.println("Unique numbers = ");
		for(int i=0; i<arr.length; i++) {
			int count = getPresentCount(arr, arr[i]);
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,6,3,5,8,9,10,9,10};
		UniqueNumberFromArray uniqueNumberFromArray = new UniqueNumberFromArray();
		uniqueNumberFromArray.printUniqueFromArray(arr);
	}
}
