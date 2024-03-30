package rohini_deshmane.array_programs;

public class UniqueNotPresentInArray {
	int getPresentCount(int arr[], int num) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		return count;
	}
	
	public boolean getDuplicateVal(int[] arr, int no,int index) {
		for(int i=0;i<index;i++) {
			if(no==arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	void printUniqueFromArray(int arr[]) {
		System.out.println("Unique numbers = ");
		for(int i=0; i<arr.length; i++) {
			int count = getPresentCount(arr, arr[i]);
			if(count!=1) {
				if(!getDuplicateVal(arr, arr[i], i))
					System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,6,3,5,8,9,10,9,10,10};
		UniqueNotPresentInArray uniqueNotNumberFromArray = new UniqueNotPresentInArray();
		uniqueNotNumberFromArray.printUniqueFromArray(arr);
	}
}
