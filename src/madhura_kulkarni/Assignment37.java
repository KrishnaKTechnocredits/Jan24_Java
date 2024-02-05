/*Assignment - 37: 4th Feb'2024
Print all the names with their frequency from given array.
 
input: {"techno", "credits", "samikash", "varsha", "techno"}
output:
techno = 2
credits=1
samikash=1
varsha=1*/

package madhura_kulkarni;

public class Assignment37 {

	int getchfreq(String[] str1, String s1) {
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			String s2 = str1[i];
			if (s2 == s1) {
				count++;
			}
		}
		return count;

	}

	boolean isStringProcessed(String[] S1, String target, int targeti) {
		boolean flag = false;
		for (int i = 0; i < targeti; i++) {
			if (S1[i].equals(target)) {
				return true;
			}
		}
		return flag;
	}

	void printStringFreq(String[] input) {
		boolean isStringProcessed = false;
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if ((isStringProcessed(input, str, i)) == false) {
				int count = getchfreq(input, str);
				System.out.println(input[i] +" -> "+ count);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samikash", "varsha", "techno" };
		Assignment37 ass = new Assignment37();
		ass.printStringFreq(arr);
	}
}
