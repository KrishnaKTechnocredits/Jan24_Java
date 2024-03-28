package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example9 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(9);
		al.add(15);
		al.add(17);
		
		/*int index = 0;
		for(int num : al) {
			al.add(index, num+1);
			index++;
		}*/
		
		for(int num : al) {
			if(num==10)
				al.remove(Integer.valueOf(num));
		}
		System.out.println(al);
	}
}
