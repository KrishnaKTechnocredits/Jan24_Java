package akshay_gaikwad;
/* find the second highest number from given array using sorting and using array 
{2,22,3,55,66,77,34,26}
output : 66
10 :46 :: 10 : 52
*/
import java.util.*;
class SecondHighWSort{
	
	int getSecondHighNum(int [] arr){
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	public static void main(String [] args){
		int [] input1 = {2,22,3,55,66,77,77,34,26};
		int [] input2 = {0,0,0,2,22,3,55,66,0,0,34,26};
		int [] input3 = {2,22,3,55,0,0,0,34,26};
		int [] input4 = {2,22,3,0,0,0,0,34,26};

		SecondHighWSort obj = new SecondHighWSort();
		System.out.println("Second highest number in given input1 " + obj.getSecondHighNum(input1));
		System.out.println("Second highest number in given input2 " + obj.getSecondHighNum(input2));
		System.out.println("Second highest number in given input3 " + obj.getSecondHighNum(input3));
		System.out.println("Second highest number in given input4 " + obj.getSecondHighNum(input4));
	}
}