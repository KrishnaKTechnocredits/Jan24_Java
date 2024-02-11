package technocredits;

import java.util.Arrays;

public class ArrExample6 {

	static int[] reArrangeNumbers(int[] arr){
		String neOutput = "";
		String peOutput = "";

		for(int index=0;index<arr.length;index++){
			if(arr[index]<0){
				neOutput = neOutput + arr[index] + ",";
			}else{
				peOutput = peOutput + arr[index] + ",";
			}
		}

		System.out.println(neOutput); //"-12,-3,-33,"
		System.out.println(peOutput); // "10,6,44,4,"

		String output = neOutput+peOutput; //"-12,-3,-33,10,6,44,4,"
		output = output.substring(0,output.length()-1); //"-12,-3,-33,10,6,44,4"

		String[] strArr = output.split(",");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr);
		
		for(int index=0;index<strArr.length;index++){
			arr[index] = Integer.parseInt(strArr[index]);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,-33,44,4};
		int[] output = ArrExample6.reArrangeNumbers(arr);
		
		System.out.println(Arrays.toString(output));
	}
	
}
