package technocredits.interview;

import java.util.LinkedHashSet;

public class KuchToBatHe {
	
	void doMagic(int[] arr) {
		LinkedHashSet lhs = new LinkedHashSet();
		for(int num : arr) {
			lhs.add(num);
		}
		lhs.add("Maulik");
		lhs.add(false);
		System.out.println(lhs);
	}
	
	public static void main(String[] args) {
		int[] num = {10,20,33,10,20,12,12,3,4,5,10,10,10};
		new KuchToBatHe().doMagic(num);
	}
}
