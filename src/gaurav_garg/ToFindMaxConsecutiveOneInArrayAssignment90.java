/*
 * 
 * Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3
 */
package gaurav_garg;

import java.util.LinkedHashMap;

public class ToFindMaxConsecutiveOneInArrayAssignment90 {

	void printMaxConsecutive(int arr[],int checknumber) {
		LinkedHashMap<Integer, Integer> hg = new LinkedHashMap<Integer, Integer>();
		int max = 0;
		hg.put(checknumber, 0);
		for (int num : arr) {
			if (num == checknumber) {
				int count = hg.get(num);
				hg.put(num, count + 1);
				if (max <= count) {
					max = count + 1;
				}
			} else {
				hg.put(checknumber, 0);
			}
		}
		System.out.println("Max using the HashMap -: "+max);
	}
	void printMaxConsecutiveUsingArray(int arr[],int checknumber)
	{
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==checknumber)
			{
				count++;
				if(max<=count)
				{
					max=count;
				}
			}else
			{
				count=0;
			}
		}
		System.out.println("Max using the Arrays -: "+max);
	}
	

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new ToFindMaxConsecutiveOneInArrayAssignment90().printMaxConsecutive(arr,1);
		new ToFindMaxConsecutiveOneInArrayAssignment90().printMaxConsecutiveUsingArray(arr,1);
	}
}
