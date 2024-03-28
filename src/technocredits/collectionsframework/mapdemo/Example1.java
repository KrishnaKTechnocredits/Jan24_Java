package technocredits.collectionsframework.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
	static int y;
	
	public static void main(String[] args) {
		System.out.println(y);
		Map<Integer,String> mapOfStudents = new HashMap<Integer,String>();
		String temp = mapOfStudents.put(1,"Puja");
		temp = mapOfStudents.put(1,"techno");
		temp = mapOfStudents.put(1,"credits");
		
		String value = mapOfStudents.get(1);
		System.out.println(value);
		System.out.println(temp);
		System.out.println(mapOfStudents.size());
	}
}
