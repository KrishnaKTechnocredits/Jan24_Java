/*Assignment - 37: 4th Feb'2024
Print all the names with their frequency from given array.
 
input: {"techno", "credits", "samikash", "varsha", "techno"}
output:
techno = 2
credits=1
samikash=1
varsha=1------------*/
package pallavi_raut;

class FindFreqOfWordInArray {

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samikasha", "varsha", "techno" };
		FindFreqOfWordInArray findFreqOfWordInArray = new FindFreqOfWordInArray();
		findFreqOfWordInArray.printFreqOfString(arr);
	}

	void printFreqOfString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int count = getCountStringFreq(input, input[i]);
			System.out.println(input[i] + " = " + count);
		}
	}

	int getCountStringFreq(String[] input, String name) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (str.equalsIgnoreCase(name))
				count++;
		}
		return count;
	}
}