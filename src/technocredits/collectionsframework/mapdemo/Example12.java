package technocredits.collectionsframework.mapdemo;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example12 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maulik");
		al.add(null);
		al.add(null);
		al.add("Krishna");
		
		TreeSet<String> ts = new TreeSet<String>(al);
	}
}
