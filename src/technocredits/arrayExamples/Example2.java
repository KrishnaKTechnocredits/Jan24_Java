package technocredits.arrayExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
	
	String[] processArr(String[] names) {
		
		List<String> listOfNames = new ArrayList<String>();
		for(String name: names) {
			if(name.length()>5)
				listOfNames.add(name);
		}
		String temp[] = new String[listOfNames.size()];
		return listOfNames.toArray(temp);
	}
	
	public static void main(String[] args) {
		String[] names = {"Phenol", "Garima", "Varsha", "Jay", "Samiksha", "Dharma", "Sveta"};
		Example2 example2 = new Example2();
		String[] arr = example2.processArr(names);
		System.out.println(Arrays.toString(arr));
	}
}
