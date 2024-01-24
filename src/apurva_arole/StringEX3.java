package apurva_arole;

public class StringEX3 {
	void getFrequencyOfchar(String str, char ch) {
		int count=0;
		str=str.toLowerCase();
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) == ch) {
				count ++;
			}
		}
		System.out.println("Frequency of "+ch +" in "+str+" is "+count);
}
	public static void main(String[] args) {
		StringEX3 stringEX3= new StringEX3();
		stringEX3.getFrequencyOfchar("Technocredits Teaches",'t');
	}
}
