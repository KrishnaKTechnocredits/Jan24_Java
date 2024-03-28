package technocredits.collectionsframework.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example13 {

	public static void main(String[] args) {

		String[] arr = { "Dharma", "Garima", "Gaurav", "Pramod", "Shramika", "Sveta", "Varsha" };

		List<String> hs = new ArrayList<String>(Arrays.asList(arr));
		/*for (String name : hs) {
			if (name.length() <= 5)
				hs.remove(name);
		}
		System.out.println(hs);*/
		
		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.length() <= 5) {
				itr.remove();
			}
		}
				
		System.out.println(hs);
		/*System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
*/	}
}
