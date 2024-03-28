package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Shramika");
		listOfNames.add("Akshay");
		listOfNames.add("Gaurav");
		listOfNames.add("Rupali");
		listOfNames.add("Madhura");
		listOfNames.add("Akshay");
		listOfNames.add("Shridhar");
		listOfNames.add("Sarang");
		listOfNames.add("Garima");
		listOfNames.add("Dharma");
		listOfNames.add("Phenol");
		
		System.out.println(listOfNames.get(listOfNames.size()));
		
		/*for(int index=0;index<listOfNames.size();index++) {
			listOfNames.remove(listOfNames.size()-1);
			if(listOfNames.size()<3)
				break;
		}
		*/
		
		/*for(int index=0;index<listOfNames.size();index++) {
			String name = listOfNames.get(index);
			String name1 = listOfNames.get(index+1);
			if(name.equals("Garima"))
				listOfNames.remove("Garima");
			System.out.println(name + ":" + name1);
		}*/
		System.out.println(listOfNames);
	}
}
