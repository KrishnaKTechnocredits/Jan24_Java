package akshay_gaikwad;

public class FreqChInStr {
	void freqChInStr(String name , char ch) {
		int count = 0;
		name = name.toLowerCase();
		for (int index = 0 ; index < name.length() ; index++) {
			if (ch == name.charAt(index)){
				count++;
			}
			
		}
		System.out.println("Frequency of " + ch + " in given string is " + count);
	}
	
	public static void main(String[] args) {
		FreqChInStr freqChInStr = new FreqChInStr();
		freqChInStr.freqChInStr("technocrediTs teaches Technology.", 't');
	}
}
