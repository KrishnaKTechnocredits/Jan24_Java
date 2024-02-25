package rohini_deshmane.array_programs;
/*
 * Assignment - 59 : 14th Feb'2024
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
 */

public class MaxFrequecyCharFromString {
	
	int charCount(char ch, String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.toLowerCase().charAt(i)== Character.toLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	boolean isProcesssChar(char ch, String str, int targetIndex) {
		boolean flag=false;
		for(int i=0; i<targetIndex; i++) {
			if(str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
				flag = true;
			}
		}
		return flag;
	}
	
	void printMaxFreqChar(String str) {
		char ch=' ';
		int count=0, maxCount=0;
		for(int index=0; index<str.length(); index++) {
			if(!isProcesssChar(str.charAt(index), str,index)) {
				count = charCount(str.charAt(index), str);
				if(count > maxCount) {
					ch = str.charAt(index);
					maxCount =count;
				}
			}
		}
		System.out.println(ch + " --> "+maxCount);
	}
		
	
	public static void main(String[] args) {
		MaxFrequecyCharFromString maxFreq = new MaxFrequecyCharFromString();
		maxFreq.printMaxFreqChar("TeeCccChH");
	}

}
