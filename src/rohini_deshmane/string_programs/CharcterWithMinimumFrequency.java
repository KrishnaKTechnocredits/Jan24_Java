package rohini_deshmane.string_programs;
/*
 * Assignment - 58 : 14th Feb'2024
"Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */
public class CharcterWithMinimumFrequency {
	
	int countOfChar(String str, char targetChar) {
		int count=0;
		for(int i=0; i < str.length(); i++) {
			if(str.toLowerCase().charAt(i) == Character.toLowerCase(targetChar)) {
				count++;
			}
		}
		
		return count;
	}
	
	boolean isProcessedString(String str, char ch, int targetIndex) {
		for(int i=0; i< targetIndex; i++) {
			if(str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
				return true;
			}
		}
		return false;
	}

	void printMinFrequencyChar(String str) {
		int count, finalCount =str.length();
		char finalCh=' ';
		for(int index =0; index <str.length(); index++) {
			char ch = str.charAt(index);
			if(!isProcessedString(str, ch, index))
			{
				count =countOfChar(str, ch);
				if(countOfChar(str, ch) <= finalCount) {
					finalCh = ch; 
					finalCount = count;
				}
			}
		}
		System.out.println(finalCh +" ==> "+finalCount);	
		
	}
	
	public static void main(String[] args) {
		CharcterWithMinimumFrequency minFreChar = new CharcterWithMinimumFrequency();
		minFreChar.printMinFrequencyChar("aakanksha");
	}
}
