package samiksha;

public class MaxFreq1 {
	
	int getFreq(String str, char targetCh) {
		int count=0;
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(ch == targetCh) {
				count++;
			}
		}
		return count;
	}
	
	void printMaxFreq() {
		int max=0;
		char MaxChar= ' ';
		String str="TeeCccChH";
		for(int index=0; index<str.length();index++) {
			str=str.toLowerCase();
			char ch= str.charAt(index);
			int count= getFreq(str, ch);
			if(max < count) {
				max=count;
				MaxChar=ch;
			}
		}System.out.println(MaxChar + " -> " + max);
	}
	
	public static void main(String[] args) {
		new MaxFreq1().printMaxFreq();
	}
}
