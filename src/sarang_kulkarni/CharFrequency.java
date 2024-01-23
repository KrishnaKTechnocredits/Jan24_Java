package sarang_kulkarni;

public class CharFrequency {
	static int count=0;
	//private static CharFrequency frequecy;

	public static void main(String[] args) {
				CharFrequency freq = new CharFrequency();
		freq.charfreq("technocredits");
		System.out.println("Frequency of t in technocredits is "+count);
		}
	
	public void charfreq(String str){
		int len=str.length();
		for (int i=0;i<len-1;i++) {
			if(str.charAt(i)=='t') {
				count++;
			}
		}
	}
}
