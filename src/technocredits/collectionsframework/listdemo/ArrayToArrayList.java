package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	boolean isNumPresent(Integer[] num) {
		List<Integer> arr = Arrays.asList(num);
		return arr.contains(100);
	}
	
	boolean isPrime(int number) {
		for(int num=2;num<=Math.sqrt(number);num++) {
			if(number%num == 0) {
				return false;
			}
		}
		return true;
	}
	
	Integer[] getListOfPrimeNumbers(Integer[] arr) {
		List<Integer> primeNumberList = new ArrayList<Integer>();
		for(int num : arr) {
			boolean flag = isPrime(num);
			if(flag) {
				primeNumberList.add(num);
			}
		}
		Integer[] output = new Integer[primeNumberList.size()];
		return primeNumberList.toArray(output);
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,11,55,78,99,100,123,122};
		Integer[] output = new ArrayToArrayList().getListOfPrimeNumbers(arr);
		System.out.println(Arrays.toString(output));
	}
}
