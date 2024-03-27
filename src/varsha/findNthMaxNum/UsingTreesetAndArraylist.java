package varsha.findNthMaxNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//1. find the second highest number from given array using sorting and using array.
//input : {2,22,3,55,66,77,77,34,26}
//output : 66

public class UsingTreesetAndArraylist {

	void findNthMaxNumber(Integer[] arr, int number) {
		Set<Integer> setOfNum = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(setOfNum);

		List<Integer> listOfNum = new ArrayList<Integer>(setOfNum);
		System.out.println(listOfNum.get(listOfNum.size() - number));
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		new UsingTreesetAndArraylist().findNthMaxNumber(arr, 2);
		new UsingTreesetAndArraylist().findNthMaxNumber(arr, 4);
		new UsingTreesetAndArraylist().findNthMaxNumber(arr, 1);
	}
}
