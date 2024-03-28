package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example2 {
	
	// Java 1.5
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>(); // Declaration
		numList.add(20);
		numList.add(34); // Autoboxing [1.5]
		numList.add(13); // int -> Integer
		numList.add(100);
		
//		Object obj = numList.get(0); // Integer -> int [unboxing]
//		Integer i = (Integer)obj;
//		int j = i.intValue();
		
		//int temp = numList.get(0);
	}
}
