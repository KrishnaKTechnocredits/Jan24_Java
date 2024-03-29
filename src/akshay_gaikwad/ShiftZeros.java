package akshay_gaikwad;
/*1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the begining of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]

21 mins
*/
import java.util.*;
class ShiftZeros{
	
	int getZeroCount(int [] arr){
		int count = 0;
		for(int num : arr){
			if(num == 0){
				count++;
			}
		}
		return count;
	}
	int [] shiftZerosAtEnd(int[] arr){
		
		int [] output= new int[arr.length];
		int index = 0;
		int zeroIndex = arr.length - getZeroCount(arr);
		for(int num : arr){
			if(num != 0){
				output[index++] = num;
			}else{
				output[zeroIndex++] = num;
			}
		}
		return output;
	}
	
	int [] shiftZeroAtStart(int [] arr){
		
		int [] output = new int[arr.length];
		int zeroIndex = 0;
		int index = getZeroCount(arr);
		for(int num : arr){
			if(num == 0){
				output[zeroIndex++] = 0;
			}else{
				output[index++] = num;
			}
		}
		return output;
	}
	
	public static void main(String [] args){
		int[] input = {1,0,0,12,63,4,0,0,5,6,7};
		
		int[] endZero = new ShiftZeros().shiftZerosAtEnd(input);
		System.out.println(Arrays.toString(endZero));

		int [] startZero = new ShiftZeros().shiftZeroAtStart(input);
		System.out.println(Arrays.toString(startZero));
	}
}