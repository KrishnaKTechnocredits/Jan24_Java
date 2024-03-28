package technocredits.collectionsframework.mapdemo;

import java.util.HashMap;

public class Example10 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Maulik", 1);
		hm.put("Akshada", 3);
		hm.put("Varsha", 5);
	
		hm.put("Techno", hm.get("Varsha"));
		hm.remove("Varsha");
		
		System.out.println(hm);
		System.out.println(hm.values());
		
	}
}
