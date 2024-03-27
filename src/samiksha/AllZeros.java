package samiksha;

import java.util.Arrays;

public class AllZeros {
	
	void printZeroAtLast(int[]arr) {
		System.out.println("all zeros at last : ");
		int [] num = new int[arr.length];
		int j=0;
		int x=arr.length-1;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!= 0) {
				num[j]=arr[index];
				j++;
			}else if(arr[index]==0) {
				num[x]=arr[index];
				x--;
			}
		}System.out.println(Arrays.toString(num));
	}
	
	void printZeroAtFirst(int[]arr) {
		System.out.println("All zeros at first : ");
		int[]num = new int[arr.length];
		int j=0;
		int x=arr.length-1;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==0) {
				num[j]=arr[index];
			}else if(arr[index] !=0) {
				num[x]=arr[index];
				x--;
		    }
		}System.out.println(Arrays.toString(num));
	}
	
	public static void main(String[] args) {
		int[]input= {1,0,0,12,63,4,0,0,5,6,7};
		AllZeros al =new AllZeros();
		al.printZeroAtLast(input);
		al.printZeroAtFirst(input);
	}

}
