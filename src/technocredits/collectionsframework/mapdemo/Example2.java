package technocredits.collectionsframework.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	
	public static void main(String[] args) {
		HashMap<String,String> mapOfStudents = new HashMap<String,String>();
		mapOfStudents.put("Maulik", "Kanani");
		mapOfStudents.put("Krishna", "Kanani");
		mapOfStudents.put("Aashvi", "Kanani");
		String temp = mapOfStudents.put("Maulik", "Techno");
		mapOfStudents.put("Maulik", temp);
		
		System.out.println(mapOfStudents.size());
		System.out.println(mapOfStudents.get("maulik"));
		
		System.out.println(mapOfStudents.toString());
		
		System.out.println(mapOfStudents.containsKey("Techno"));
	}
}
