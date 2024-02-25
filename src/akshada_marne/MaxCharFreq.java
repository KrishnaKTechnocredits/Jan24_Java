package akshada_marne;

public class MaxCharFreq {
	
	int findCharFreq(String str, char targetch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
		char ch=str.charAt(index);
		
		if(ch==targetch) {
			count++;
		}
		}
		return count;
	}
	
	void findMaxFeqChar(String str) {
		int max = 0;
		char maxCh = ' ';
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int charcount = findCharFreq(str, ch);
			if (charcount > max) {
				max = charcount;
				maxCh = ch;
			}
		}
		System.out.println(maxCh + "->" + max);
	}
	public static void main(String args[]) {
		MaxCharFreq maxCharFreq=new MaxCharFreq();
		//maxCharFreq.findCharFreq("TeeCccChH");
		maxCharFreq.findMaxFeqChar("TeeCccChH");
		
	}
}