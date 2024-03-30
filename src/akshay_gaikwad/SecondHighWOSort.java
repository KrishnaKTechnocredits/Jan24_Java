package akshay_gaikwad;
/*1. find the second highest number from given array without using sorting and using array.
input : {2,22,3,55,66,77,77,34,26}
output : 66
10:19 :: 10 :38*/

class SecondHighWOSort{
	int getSecondHighNum(int[] arr){
		int maxNumIndex = getMaxNumIndex(arr);
		arr[maxNumIndex] = Integer.MIN_VALUE;
		int secMaxIndex = getMaxNumIndex(arr);
		return arr[secMaxIndex];
	}
	
	int getMaxNumIndex(int [] arr){
		int maxNum = Integer.MIN_VALUE;
		int maxIndex = -1;
		for(int index = 0; index < arr.length; index++){
			int num = arr[index];
			if(num > maxNum){
				maxNum = num;
				maxIndex = index;
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args){
		int [] input1 = {2,22,3,55,66,77,77,34,26};
		int [] input2 = {0,0,0,2,22,3,55,66,0,0,34,26};
		int [] input3 = {2,22,3,55,0,0,0,34,26};
		int [] input4 = {2,22,3,0,0,0,0,34,26};

		SecondHighWOSort obj = new SecondHighWOSort();
		System.out.println("Second highest number in given input1 " + obj.getSecondHighNum(input1));
		System.out.println("Second highest number in given input2 " + obj.getSecondHighNum(input2));
		System.out.println("Second highest number in given input3 " + obj.getSecondHighNum(input3));
		System.out.println("Second highest number in given input4 " + obj.getSecondHighNum(input4));
	}
}