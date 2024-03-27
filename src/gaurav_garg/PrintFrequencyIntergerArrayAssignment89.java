package gaurav_garg;

import java.util.LinkedHashMap;
import java.util.Set;

public class PrintFrequencyIntergerArrayAssignment89 {

	void printMaxFrequencyNumber(int aa[]) {
		int max = 0;
		int maxNumber = 0;
		LinkedHashMap<Integer, Integer> hg = new LinkedHashMap<Integer, Integer>();
		for (int i : aa) {
			if (hg.containsKey(i)) {
				int count = hg.get(i);
				hg.put(i, count + 1);
			} else {
				hg.put(i, 1);
			}
		}
		System.out.println(hg);

		Set<Integer> h = hg.keySet();
//		System.out.print(h);
		for (int i : h) {
			int a = hg.get(i);
			if (max <= a) {
				max = a;
				maxNumber = i;
			}
		}
		System.out.println(maxNumber + " has max freq -> " + max);
	}

	public static void main(String[] args) {
		int aa[] = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new PrintFrequencyIntergerArrayAssignment89().printMaxFrequencyNumber(aa);
	}
}
