/*Assignment - 35 : 4th Feb'2024
Return the sum of even numbers from the array
input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 60
hint 6, 20, 4, 26*/
package sveta;

public class Assignment_35_SumOfEvenNoIndex {

	public static void evenNoSum(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]%2==0) {
				sum += arr[index];

			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr={3, 6, 9, 11, 15, 20, 4, 26};
		evenNoSum(arr);
		
	}

}
