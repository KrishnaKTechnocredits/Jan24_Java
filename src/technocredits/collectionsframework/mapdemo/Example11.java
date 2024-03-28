package technocredits.collectionsframework.mapdemo;

import java.util.Map;
import java.util.TreeMap;

public class Example11 {
	
	public static void main(String[] args) {
		Map<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("Techno", null);
		hm.put("Credits", null);
		//hm.put(null, 10);
		//hm.put(null, 20);
	
		System.out.println(hm);
		
		//String str1 = null;
		//String str2 = "Techno";
		
		//System.out.println(str1.compareTo(str2));
	}
}
