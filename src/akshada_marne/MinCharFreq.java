package akshada_marne;

public class MinCharFreq {
	
	
	
	int getFreq(String str, char character) {
		int count=0;
		for(int index=str.length()-1;index>=0;index--) {
			char ch=str.charAt(index);
			if(ch==character)
				count++;
		}
		return count;
	}
	
	
	void printChar(String str) {
		for(int index=str.length()-1;index>=0;index--) {
		char ch=str.charAt(index);
		int count=getFreq(str, ch);
		
		if(count==1) {
			System.out.println(ch+"->"+count);
			break;
			
		}
	 }
	}
	
	public static void main(String args[]) {
		MinCharFreq minCharFreq= new MinCharFreq();
		minCharFreq.printChar("aakanksha");
		
	}
}
