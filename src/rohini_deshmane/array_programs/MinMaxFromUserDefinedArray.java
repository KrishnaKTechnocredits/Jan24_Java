package rohini_deshmane.array_programs;
import java.util.Scanner; 

public class MinMaxFromUserDefinedArray {

	int findMin(int[] arr) {
		int min =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	int findMax(int[] arr) {
		int max =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	void getArray() {
		int totalCount=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Total size of Array");
		totalCount = scan.nextInt();
		int[] newArr = new int[totalCount];
		
		for(int i=0; i<totalCount; i++) {
			scan = new Scanner(System.in);
			System.out.println("Enter Number "+i+1);
			newArr[i ]= scan.nextInt();
		}
		
		System.out.println("Minimum Number = "+findMin(newArr));
		System.out.println("Maximum Number = "+findMax(newArr));
	}
	
	public static void main(String[] args) {
		
		MinMaxFromUserDefinedArray arrayMinMax = new MinMaxFromUserDefinedArray();
		arrayMinMax.getArray();
		
	}
}
