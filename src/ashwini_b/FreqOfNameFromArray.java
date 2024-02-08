package ashwini_b;

/*
 Assignment - 37: 4th Feb'2024
Print all the names with their frequency from given array. 
input: {"techno", "credits", "samikash", "varsha", "techno" }
output:
techno = 2
credits=1
samikash=1
varsha=1
 */

public class FreqOfNameFromArray {

	int getFreqOfString(String[] strArr, String searchStr) {
		int count = 0;
		for (int index = 0; index < strArr.length; index++) {
			String temp = strArr[index];
			if (temp == searchStr) {
				count++;
			}
		}
		return count;
	}

	void printNameAndFreq(String[] strArr) {
		for (int index = 0; index < strArr.length; index++) {
			String str = strArr[index];
			int count = getFreqOfString(strArr, str);
			System.out.println(str + "->" + count);
		}
	}

	public static void main(String[] args) {
		String[] arry = { "techno", "credits", "samikash", "varsha", "techno" };
		FreqOfNameFromArray freqOfNameFromArray = new FreqOfNameFromArray();
		freqOfNameFromArray.printNameAndFreq(arry);
	}
}
