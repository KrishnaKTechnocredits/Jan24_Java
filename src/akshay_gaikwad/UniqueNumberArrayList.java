//int[] arr = {10,5,5,6,9,7,15,12,15,18,8};
package akshay_gaikwad;
import java.util.ArrayList;

public class UniqueNumberArrayList {
	
	void printUniqueNum(int [] arr) {
		ArrayList<Integer> arrList = convertToIntArray(arr);
		for(Integer num : arrList) {
			if(arrList.indexOf(num) == arrList.lastIndexOf(num)) {
				System.out.print(num + " ");
			}
		}
	}
	
	ArrayList<Integer>  convertToIntArray(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int num : arr) {
			arrList.add(num);
		}
		return arrList;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,5,6,9,7,15,12,15,18,8};
		new UniqueNumberArrayList().printUniqueNum(arr);
	}
}
