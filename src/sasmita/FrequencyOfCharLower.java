package sasmita;

public class FrequencyOfCharLower {
	
	void frequencyofchar(String str,char ch) {
		int count=0;
		str = str.toLowerCase();
		for(int index=0; index<str.length(); index++){
			char newchar = str.charAt(index);
			if(newchar == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch +" in technocrediTs teaches Technology is " +count);
	}
	public static void main(String[] args) {
		FrequencyOfCharLower freq= new FrequencyOfCharLower();
		freq.frequencyofchar("technocrediTs teaches Technology",'t');
	}

}
