package sasmita;

public class FrequencyOfCharacter{
	int count;
	void frequency(String input,char t) {
		for(int index=0; index<input.length(); index++){
			//System.out.println(input.charAt(index));//
			char ch =input.charAt(index);
			if(t == ch) {
				count++;	
			}
		}
		System.out.print("Frequency of " +t+" in technocredits is " +count);
	}
	public static void main(String[] args) {
		FrequencyOfCharacter freq = new FrequencyOfCharacter();
		freq.frequency("technocredits", 't');
	}
}
