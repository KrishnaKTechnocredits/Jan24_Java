package hiral_purohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*find the nth highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}*/

public class Assignment_95_p4 {

	void toGetNthmaxNumber(Integer[] arr, int n) {
		Set<Integer> maxSet = new TreeSet<Integer>(Arrays.asList(arr));

		List<Integer> maxList = new ArrayList<Integer>(maxSet);
		int max = maxList.get(maxList.size() - n);
		System.out.println("maximum nuber with help of Treeset is :" + max);
	}

	public static void main(String[] args) {
		Integer[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		Assignment_95_p4 assignment_95_p4 = new Assignment_95_p4();
		System.out.println("..........Second Maximum is........");
		assignment_95_p4.toGetNthmaxNumber(input, 2);
		System.out.println("..........fourth Maximum is........");
		assignment_95_p4.toGetNthmaxNumber(input, 4);

	}

}
