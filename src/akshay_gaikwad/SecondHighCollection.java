package akshay_gaikwad;
/*find the second highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}
output : 66
10:58 :: 11 : 07;
*/
import java.util.*;
class SecondHighCollection{
	int getSecondNum(Integer [] arr){
		Set<Integer> setOfNum = new TreeSet<>(Arrays.asList(arr));
		List<Integer> listOfNum = new ArrayList<>(setOfNum);
		return listOfNum.get(listOfNum.size()-2);
	}
	
	public static void main(String [] args){
		Integer [] input1 = {2,22,3,55,66,77,77,34,26};
		Integer [] input2 = {0,0,0,2,22,3,55,66,0,0,34,26};
		Integer [] input3 = {2,22,3,55,0,0,0,34,26};
		Integer [] input4 = {2,22,3,0,0,0,0,34,26};

		SecondHighCollection obj = new SecondHighCollection();
		System.out.println("Second highest number in given input1 " + obj.getSecondNum(input1));
		System.out.println("Second highest number in given input2 " + obj.getSecondNum(input2));
		System.out.println("Second highest number in given input3 " + obj.getSecondNum(input3));
		System.out.println("Second highest number in given input4 " + obj.getSecondNum(input4));
	}
	
}