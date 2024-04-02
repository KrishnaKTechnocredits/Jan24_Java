package sveta;

import java.util.HashMap;
import java.util.Map;

public class Assignment_86_1 {

	int countNoFreq(int[] arr, int no){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(no==arr[i]){
				count++;
			}
		}
		return count;
	}
	void noFreq(int[] arr) {
		Map<Integer,Integer> hm=new HashMap<Integer,Integer> ();
		for(int i=0;i<arr.length;i++) {
			int count=countNoFreq(arr, arr[i]);
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], count);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		int[] data = {10,10,3,4,3,3,3,3,55,56};
		new Assignment_86_1().noFreq(data);
	}

}
