package akshay_gaikwad;
/*Assignment - 90 : 25th March'2024 [30 mins]
Code to find max consecutive 1’s in an array is : " + maxCount); [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3
8 mins
*/

class ConsecutiveNum{
	
	void printMaxConsecutive(int [] arr){
		int count = 0;
		int maxCount = 0;
		for(int index = 0; index < arr.length; index++){
			if(arr[index] == 1){
				count++;
			}else{
				count = 0;
			}
			if(count > maxCount){
				maxCount = count;
			}
		}
		System.out.println("max consecutive 1\'s in an array is : " + maxCount);
	}
	
	public static void main(String[] args){
	int [] arr = {0,0,1,0,0,1,1,0,1,1,1,0};
	new ConsecutiveNum().printMaxConsecutive(arr);
	}
}