package technocredits.collectionsframework.mapdemo;

import java.util.ArrayList;

public class Example5 {

	ArrayList<Integer> converArraytoArrayList(int[] arr){
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int num : arr) {
			listOfNumbers.add(num);
		}
		return listOfNumbers;
	}
	
	void printUniqueWordArray(int[] arr) {
		ArrayList<Integer> listOfNumbers = converArraytoArrayList(arr);
		for(int num : listOfNumbers) {
			if(listOfNumbers.indexOf(num) == listOfNumbers.lastIndexOf(num))
				System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,10,3,4,3,3,3,3,55,56};
		new Example5().printUniqueWordArray(arr);
	}
}
