package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example6 {
	
	public static void main(String[] args) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(13);
		listOfNum.add(3);
		listOfNum.add(15);
		listOfNum.add(22);
		listOfNum.add(55);
		listOfNum.add(65);
	
		System.out.println(listOfNum);
		listOfNum.remove(3);
		listOfNum.remove(Integer.valueOf(3));
		System.out.println(listOfNum);
		
	}
}
