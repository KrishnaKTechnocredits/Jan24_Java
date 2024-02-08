/*Assignment - 37: 4th Feb'2024
Print all the names with their frequency from given array.
 
input: {"techno", "credits", "samikash", "varsha", "techno"}
output:
techno = 2
credits=1
samikash=1
varsha=1*/

package sarang_kulkarni;

public class AllNameFreq {

	int getFrequency(String[] inputArr, String inputStr) {
		int count = 0;
		for( int i =0 ; i< inputArr.length; i++) {
			if(inputStr.equals(inputArr[i])) {
				count++;
			}
		}
		return count;
	}

	boolean isProcessed(String[] str , String inpStr , int index) {
		boolean flag = false;
		for(int i =0; i < index; i++) {
			if(str[i].equals(inpStr)) {
				return true;
			}
		}
		return flag;
		}

	void printNameWithFreq(String[] stringArr) {
		for(int i =0; i< stringArr.length; i++) {
			if (!isProcessed(stringArr, stringArr[i] , i))
				System.out.println(stringArr[i] +" = " + getFrequency(stringArr, stringArr[i] ) );
		 }
	}

	public static void main(String[] args) {
		String[] arr = {"techno", "credits", "samikash", "varsha", "techno"};
		new AllNameFreq().printNameWithFreq(arr);

	}
}
