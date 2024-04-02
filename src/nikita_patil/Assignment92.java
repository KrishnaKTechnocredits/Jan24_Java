package nikita_patil;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Assignment92 {
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
		// TODO Auto-generated method stub
		String str = "abc xyz abc pqr";
		new Assignment92().toGetFrequencyOfStringWithMap(str);
	}

}

	
