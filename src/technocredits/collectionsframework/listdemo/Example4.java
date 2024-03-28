package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example4 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maulik");
		al.add("Krishna");
		al.add("kanani");
		
		System.out.println(al);
		
		al.add(1,"Aashvi");
		System.out.println(al);
		
		String temp = al.set(0, "Technocredits");
		System.out.println(temp); // 
		System.out.println(al);
	}
}
