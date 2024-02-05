/*Assignment - 38 : 4th Feb'2024
Return the max & min number from given array.
input : [10,20,50,60,30]
output : min : 10 max : 60*/

package sveta;
public class Assignment_38_MinMax {

	
	public void minumNo(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("minimun no is : "+min);
	}
	
	public void maximumNo(int []arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("maximun no is : "+max);
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,50,60,30};
		Assignment_38_MinMax minmax=new Assignment_38_MinMax();
		minmax.minumNo(arr);
		minmax.maximumNo(arr);
		
	}

}
