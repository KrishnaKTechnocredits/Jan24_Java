package technocredits.collectionsframework.setdemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class Example7 {
	
	int[] m1(int[] x) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int[] primitive = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
		
		return primitive;
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Krishna", "Maulik", "Akshay","Akshay","Atisha","Garima","Shramika"};
		
		Set<String> setOfNames = new LinkedHashSet<String>();
		for(String name : arr) {
			if(!setOfNames.add(name)) {
				System.out.println("Duplicate name : " + name);
			}
		}
		System.out.println(setOfNames);
	}
}
