package shramika_vaidya;

//95 part3
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindNthMaxUsingCollection {

	void getnthMax(Integer[] arr, int n) {

		Set<Integer> num = new TreeSet<>(Arrays.asList(arr));
		System.out.println(num);

		List<Integer> listOfNum = new ArrayList<>(num);
		System.out.println("nthmax is->" + listOfNum.get(listOfNum.size() - n));
	}

	public static void main(String[] args) {
		Integer arr[] = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		Integer arr1[] = { 0, 0, 0, 2, 22, 3, 55, 66, 0, 0, 34, 26 };
		Integer arr2[] = { 2, 22, 3, 55, 0, 0, 0, 34, 26 };
		Integer arr3[] = { 2, 22, 3, 0, 0, 0, 0, 34, 26 };
		new FindNthMaxUsingCollection().getnthMax(arr, 4);
		new FindNthMaxUsingCollection().getnthMax(arr1, 3);
		new FindNthMaxUsingCollection().getnthMax(arr2, 2);
		new FindNthMaxUsingCollection().getnthMax(arr3, 5);

	}
}
