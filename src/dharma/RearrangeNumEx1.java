package dharma;

import java.util.Arrays;

public class RearrangeNumEx1 {

	static int[] reArrangeNum(int[] arr) {
		String neOutput = "";
		String peOutput = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				neOutput = neOutput + arr[i] + ",";
			}else {
				peOutput = peOutput + arr[i] + ",";
			}
		}
		
		String output = neOutput + peOutput;
		output = output.substring(0,output.length()-1);
		
		String[] strArr = output.split(",");
		
		for(int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,-33,44,4};
		int[] output = RearrangeNumEx1.reArrangeNum(arr);
		System.out.println(Arrays.toString(output));

	}

}
