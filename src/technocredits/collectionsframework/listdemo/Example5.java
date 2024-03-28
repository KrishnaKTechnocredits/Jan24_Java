package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example5 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maulik");
		al.add("Phenol");
		al.add("Krishna");
		al.add("Phenol");
		al.add("kanani");
		al.add("Phenol");
		
		String temp = al.set(1, "Aashvi");
		temp = al.set(1,temp);
		temp = al.set(1, temp);
		
		System.out.println(temp); //
		System.out.println(al.get(1)); //
		
		//al.set(3,"Varsha");
		System.out.println(al);
		
		System.out.println(al.contains("Phenol"));
		System.out.println(al.remove("Shramika"));
		
	}
}
