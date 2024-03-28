package shramika_vaidya;

//95 part3
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondHighestUsingTreeSetAndArrayList {

	void getSecondMax(Integer[] arr) {

		Set<Integer> num = new TreeSet<>(Arrays.asList(arr));
		System.out.println(num);

		ArrayList<Integer> al = new ArrayList<>(num);

		System.out.println("SecondMax Num is-> " + al.get(al.size() - 2));
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args) {
		Integer arr[] = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		Integer arr1[] = { 0, 0, 0, 2, 22, 3, 55, 66, 0, 0, 34, 26 };
		Integer arr2[] = { 2, 22, 3, 55, 0, 0, 0, 34, 26 };
		Integer arr3[] = { 2, 22, 3, 0, 0, 0, 0, 34, 26 };
		FindSecondHighestUsingTreeSetAndArrayList findSecondHighestUsingTreeSetAndArrayList = new FindSecondHighestUsingTreeSetAndArrayList();
		findSecondHighestUsingTreeSetAndArrayList.getSecondMax(arr);
		findSecondHighestUsingTreeSetAndArrayList.getSecondMax(arr1);
		findSecondHighestUsingTreeSetAndArrayList.getSecondMax(arr2);
		findSecondHighestUsingTreeSetAndArrayList.getSecondMax(arr3);
	}
}
