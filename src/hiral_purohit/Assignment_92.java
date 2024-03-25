package hiral_purohit;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Assignment - 92 : 25th March'2024 [15 mins]
program 1 (using map): input : abc xyz abc pqr 
O/p
abc - 2
xyz - 1
pqr - 1*/

public class Assignment_92 {

	void toGetFrequencyOfStringWithMap(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> nameMap = new TreeMap<String, Integer>();
		for (String name : arr) {
			if (nameMap.containsKey(name)) {
				int count = nameMap.get(name);
				nameMap.put(name, count + 1);
			} else {
				nameMap.put(name, 1);
			}
		}
		System.out.println(nameMap);
	}

	public static void main(String[] args) {
		String str = "abc xyz abc pqr";
		new Assignment_92().toGetFrequencyOfStringWithMap(str);
	}

}
