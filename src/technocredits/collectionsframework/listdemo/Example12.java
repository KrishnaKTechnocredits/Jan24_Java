package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example12 {
	
	public static void main(String[] args) {
		String[] arr = {"Phenol","Phenol","Rohini","Phenol", "Anand"};
		List<String> tempList = Arrays.asList(arr);
		ArrayList<String> al1 = new ArrayList<String>(tempList);
		System.out.println(al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Phenol");
		
		al1.removeAll(al2);
		System.out.println(al1);
	}
}
