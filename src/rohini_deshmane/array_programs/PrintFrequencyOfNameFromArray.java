package rohini_deshmane.array_programs;

public class PrintFrequencyOfNameFromArray {
	int countOfCharFromString(String[] str, String targetStr) {
		int count=0;
		for(int i=0; i < str.length; i++) {
			if(str[i].equalsIgnoreCase(targetStr)) {
				count++;
			}
		}
		
		return count;
	}
	
	boolean isProcessedString(String[] arr, String targetString, int targetIndex) {
		for(int i=0; i< targetIndex; i++) {
			if(arr[i].equals(targetString)) {
				return true;
			}
		}
		return false;
	}

	void printmaxFrequencyChar(String[] str) {
		int count=0;
		String ch="";
		for(int index =0; index <str.length; index++) {
			ch = str[index];
			if(!isProcessedString(str, ch, index))
			{
				count = countOfCharFromString(str, ch);
				System.out.println(ch +" ==> "+count);	
			}
		}
		
	}

	public static void main(String[] args) {
		PrintFrequencyOfNameFromArray maxFrechar = new PrintFrequencyOfNameFromArray();
		String[] strArr = {"techno", "credits", "samikash", "varsha", "techno"};
		maxFrechar.printmaxFrequencyChar(strArr);
	}
}


