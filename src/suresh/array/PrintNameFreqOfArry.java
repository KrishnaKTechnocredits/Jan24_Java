/*
 * Print all the names with their frequency from given array.
 
input: {"techno", "credits", "samikash", "varsha", "techno"}
output:
techno = 2
credits=1
samikash=1
varsha=1
 
  
 */

package suresh.array;

public class PrintNameFreqOfArry {

	int printFreqOfArry(String[] input, String targetstring) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == targetstring)
				count++;

		}
		return count;

	}

	void printnCountOfString(String[] input) {

		String str1 = "  ";
		for (int i = 0; i < input.length - 1; i++) {
			String str = input[i];
			int count = printFreqOfArry(input, str);
			str1 = str;
			if (count <= 1)
				System.out.println(count +" is "+ str1);
			if (count > 1) {
				System.out.println(count +" is "+ str1);

			}
		}

	}

	public static void main(String[] args) {
		String[] arry = { "techno", "credits", "samikash", "varsha", "techno" };
		new PrintNameFreqOfArry().printnCountOfString(arry);
	}
}
