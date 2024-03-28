/*Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using Array.
Print numbers present uniquely from array using ArrayList.
Print numbers present uniquely from array using HashMap.*/
package sveta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Assignment_84 {

	public int countOccurance(int[] arr, int no) {
		int count=0;
		for(int no1:arr) {
			if(no1==no) 
				count++;
		}
		return count;
	}
	
	public void usingArray(int[] arr) {
		System.out.println("Using Array : ");
		for(int no:arr) {
			int count = countOccurance(arr, no);
			if(count==1) 
				System.out.print(no+" ");
		}
		System.out.println();
	}
	
	public void usingArrayListUnqueVal(int[] arr) {
		System.out.println("Using ArrayList : ");
		ArrayList<Integer> arrlst = new ArrayList<Integer>();
		for(int no:arr) {
			if(!arrlst.contains(no)) {
				arrlst.add(no);
			}
		}
		System.out.println(arrlst);
	}
	
	public void usingHapMapUnqueVal(int[] arr) {
		System.out.println("Using Map : ");
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int no:arr) {
			if(hm.containsKey(no)) {
				int count =hm.get(no);
				hm.put(no, count+1);
			}else {
				hm.put(no, 1);
			}
		}
		Set<Integer> all=hm.keySet();
		for(int key:all) {
			if(hm.get(key)==1) {
				System.out.println(key+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {12,10,3,5,4,3,5,3,55,56};
		Assignment_84 ass_84 = new Assignment_84();
		ass_84.usingArrayListUnqueVal(arr);
		System.out.println(" ---------------------------------- ");
		ass_84.usingArray(arr);
		System.out.println(" ---------------------------------- ");
		ass_84.usingHapMapUnqueVal(arr);
	}

}
