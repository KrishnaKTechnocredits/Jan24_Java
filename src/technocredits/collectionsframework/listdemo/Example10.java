package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example10 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(12);
		al1.add(9);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(110);
		al2.add(12);
		al2.add(91);
		al2.add(10);
		
		//al1.addAll(al2);
		al2.removeAll(al1);
		al1.addAll(al2);
		//al1.retainAll(al2);
		
		System.out.println(al1);
		System.out.println(al2);
	}
}
