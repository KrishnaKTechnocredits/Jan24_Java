package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example11 {
	
	public static void main(String[] args) {
		String[] names = {"Varsha","Ansh","Akshay","Ashwini"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
		
		String[] arr = new String[al.size()];
		int index=0;
		for(String name : al) {
			arr[index++] = name;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
