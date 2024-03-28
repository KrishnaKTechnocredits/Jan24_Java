package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example3 {
	
	// Java 1.5
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>(100); // Declaration
		numList.add(20);
		numList.add(34); // Autoboxing [1.5]
		numList.add(13); // int -> Integer
		System.out.println(numList.add(100));	
	}
}
