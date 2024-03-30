/*Assignment - 85 : 23th March'2024
Print numbers not presented uniquely from array using Array.
Print numbers not presented uniquely from array using ArrayList.
Print numbers not presented uniquely from array using HashMap.
 */
package sveta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import suresh.PrintLastIndexOfConsonent;

public class Assignment_85 {
	
	public int countOccurance(int[] arr, int no) {
		int count=0;
		for(int no1:arr) {
			if(no1==no) 
				count++;
		}
		return count;
	}
	
	public boolean getDuplicateVal(int[] arr, int no,int index) {
		for(int i=0;i<index;i++) {
			if(no==arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public void usingArray(int[] arr) {
		int count=0;
		System.out.println("Using Array : ");
		for(int i=0;i<arr.length;i++) {
			count = countOccurance(arr, arr[i]);
			if(!getDuplicateVal(arr, arr[i], i)) {
				if(count>1) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public void usingArrayList(int[] arr) {
		System.out.println("Using ArrayList : ");
		ArrayList<Integer> arrlst = new ArrayList<Integer>();
		for(int no:arr) {
			int count=countOccurance(arr, no);
			if(count>1) {
				if(!arrlst.contains(no)) {
					arrlst.add(no);
				}
			}
		}
		System.out.println(arrlst);
	}
	
	public void usingHapMap(int[] arr) {
		System.out.println("Using Map : ");
		int no1=0,count=0;
		String str="";
		Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int no:arr) {
			no1=countOccurance(arr, no);
				if(no1>1) {
					hm.put(no, count+1);
				}
		}
		System.out.println(hm.keySet());
	}
	
	public static void main(String[] args) {
		int arr[] = {12,10,3,5,4,3,5,3,55,56,};
		Assignment_85 ass_85 = new Assignment_85();
		ass_85.usingArray(arr);
		System.out.println("\n--------------------------------- ");
		ass_85.usingArrayList(arr);
		System.out.println("---------------------------------");
		ass_85.usingHapMap(arr);
	}
}
