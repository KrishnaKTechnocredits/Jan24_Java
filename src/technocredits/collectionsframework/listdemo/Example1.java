package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>(); // Declaration
		numList.add(20);
		numList.add(34); // Autoboxing [1.5]
		numList.add(13); // int -> Integer
		numList.add(100);
		
		numList.add(1, 100);
		
		System.out.println(numList.size()); // 4

		System.out.println(numList.get(numList.size() - 1)); // 100

		System.out.println(numList.get(0));
		System.out.println(numList.get(1));
		System.out.println(numList.get(2));
		System.out.println(numList.get(3));

		System.out.println("===================");
		for (int index = 0; index < numList.size(); index++) {
			System.out.println(numList.get(index));
		}
		
	}
}
