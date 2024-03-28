package technocredits.collectionsframework.setdemo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example8 {

	public static void main(String[] args) {
		String[] arr = {"Maulik", "Krishna", "Maulik", "Akshay","Akshay","Atisha","Garima","Shramika"};
		Set<String> hs = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(hs);
	}
}
