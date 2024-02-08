package sveta;

public class FrequencyOfCharacter {

	char ch ;
	public void frequency(String str, char c) {
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			if(ch==c) {
				count++;
			}		
		}
		System.out.println("Frequency "+count);
	}
	
	public static void main(String[] args) {

		FrequencyOfCharacter freq = new FrequencyOfCharacter();
		freq.frequency("techonocredits", 't');
	}
}
