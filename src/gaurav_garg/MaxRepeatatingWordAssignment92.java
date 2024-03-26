/*
 * Assignment - 92 : 25th March'2024 [15 mins]
 * program 1 (using map): input : abc xyz abc pqr 
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.

program 2 (without using map) [extra]
input : abc xyz abc pqr [30 mins]
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.
 */

package gaurav_garg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MaxRepeatatingWordAssignment92 {

	void maxRepeatWord(String str) {
		int max = 0;
		String word = "";
		String[] ah = str.split(" ");
		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		System.out.println("Using Hash Map");
		for (String name : ah) {
			if (hs.containsKey(name)) {
				int count = hs.get(name);
				hs.put(name, count + 1);
			} else {
				hs.put(name, 1);
			}
		}
		System.out.println(hs);
		Set<String> st = hs.keySet();
		for (String i : st) {
			int c = hs.get(i);
			if (max <= c) {
				max = c;
				word = i;
			}
		}
		System.out.println("Max repeating  is -: " + word);
	}

	int getFrequencyCount(String s[], String str) {
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(str)) {
				count++;
			}
		}
		return count;
	}

	boolean ProcessedData(String str[], int i, String str1) {
		for (int j = 0; j < i; j++) {
			if (str[j].equals(str1)) {
				return false;
			}
		}
		return true;
	}

	void maxRepeatWordusingArrays(String str) {
		int max=0;
		String new1="";
		String s1[] = str.split(" ");
		System.out.println("Using Arrays");
		for (int i = 0; i < s1.length; i++) {
			int count = getFrequencyCount(s1, s1[i]);
			boolean b = ProcessedData(s1, i, s1[i]);
			if (b == true) {
				System.out.println(s1[i] + " " + count);
			}
			if(max<=count)
			{
				max=count;
				new1=s1[i];
			}
		}
		System.out.println("Max repeating  is -: " + new1);
	}

	public static void main(String[] args) {
		String s = "abc xyz abc pqr";
		new MaxRepeatatingWordAssignment92().maxRepeatWord(s);
		new MaxRepeatatingWordAssignment92().maxRepeatWordusingArrays(s);
	}
}
