package hiral_purohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*find the second highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}
output : 66*/

public class Assignment_95_p3 {

	int toGetSecondMaxMap(Integer[] arr) {
		Set<Integer> maxSet = new TreeSet<Integer>(Arrays.asList(arr));

		List<Integer> listNum = new ArrayList<Integer>(maxSet);
		int max = listNum.get(listNum.size() - 2);
		return max;
	}

	public static void main(String[] args) {
		Integer[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		int max = new Assignment_95_p3().toGetSecondMaxMap(input);
		System.out.println("Second max with using treeSet: " + max);
	}

}
