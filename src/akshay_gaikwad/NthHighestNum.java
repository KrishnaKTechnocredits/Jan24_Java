package akshay_gaikwad;
/*4 find the nth highest number from given array [Collections framework (TreeSet -> ArrayList)].
11:20 ::
*/
import java.util.*;
class NthHighestNum{
	
	int getNthHigh(Integer [] arr, int n){
		Set<Integer> setOfNum = new TreeSet<>(Arrays.asList(arr));
		ArrayList<Integer> arrList= new ArrayList<>(setOfNum);
		if(arrList.size() > n){
			return arrList.get(arrList.size() - n);
		}else{
			return -1;
		}
	}
	public static void main(String [] args){
		Integer [] input1 = {2,22,3,55,66,77,77,34,26};
		Integer [] input2 = {0,0,0,2,22,3,55,66,0,0,34,26};
		Integer [] input3 = {2,22,3,55,0,0,0,34,26};
		Integer [] input4 = {2,22,3,0,0,0,0,34,26};

		NthHighestNum obj = new NthHighestNum();
		System.out.println("2nd highest number in given input1 " + obj.getNthHigh(input1, 2));
		System.out.println("3rd highest number in given input2 " + obj.getNthHigh(input2,3));
		System.out.println("4th highest number in given input3 " + obj.getNthHigh(input3,4));
		System.out.println("5th highest number in given input4 " + obj.getNthHigh(input4,5));
	}
}
