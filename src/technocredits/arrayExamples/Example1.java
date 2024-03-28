package technocredits.arrayExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

	boolean isNameContains(String[] arr, String name){
		List<String> nameList = Arrays.asList(arr);
		return nameList.contains(name);
	}
	
	List<String> processData(String[] arr, String name){
		List<String> nameList = Arrays.asList(arr);
		ArrayList<String> finalNameList = new ArrayList<String>(nameList);
		
		if(finalNameList.contains(name)){
			int index = finalNameList.indexOf(name);
			finalNameList.set(index,"techno");
			finalNameList.add(index+1,"credits");
		}
		return finalNameList;
	}
	
	double m1() {
		int x = 10;
		return x;
	}
	
	public static void main(String[] args) {
		String[] names = {"Phenol", "Garima", "Varsha", "Samiksha", "Dharma", "Sveta"};
		Example1 ex1 = new Example1();
		boolean flag = ex1.isNameContains(names, "Dharma");
		System.out.println(flag);
		
		List<String> listOfNames = ex1.processData(names, "Dharma");
		System.out.println(listOfNames);
	}
}
