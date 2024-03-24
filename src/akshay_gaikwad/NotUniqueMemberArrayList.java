//int [] arr = {10,5,2,10,5,8,9,10,6,8};
package akshay_gaikwad;

import java.util.*;

public class NotUniqueMemberArrayList {

	void printNotUniqueEle(Integer[] arr) {
		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> outList = new ArrayList<>();
		for (Integer num : arrList) {
			if (arrList.indexOf(num) != arrList.lastIndexOf(num)) {
				if(!outList.contains(num)) {
					outList.add(num);
				}
			}
		}
		System.out.println(outList);
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 5, 2, 10, 5, 8, 9, 10, 6, 8};
		new NotUniqueMemberArrayList().printNotUniqueEle(arr);
	}
}
