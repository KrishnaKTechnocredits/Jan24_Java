/*
 Assignment - 83 : 21th March'2024
I__am___in_pune____

output : I -> 2
         am -> 3
		 in -> 1
         pune -> 4
 */
package gaurav_garg;

import java.util.ArrayList;


public class CountUnderscoreInStringAssignment83 {

	static int count;

	static void countUnderscoreInString(String s) {
		s = s + 'j';
		String s2[] = s.split("_+");
		char s1[] = s.toCharArray();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (char name : s1) {

			if (name == '_') {
				count = count + 1;
			} else {
				al.add(count);
				count = 0;
			}
		}
		while (al.contains(Integer.valueOf(0))) {
			al.remove(Integer.valueOf(0));
		}

		for (int i = 0; i < s2.length-1; i++) {
			System.out.println(s2[i] + " -> " + al.get(i));
		}
	}

	public static void main(String[] args) {
		String s = "I__am___in_pune____";
		countUnderscoreInString(s);
	}
}
