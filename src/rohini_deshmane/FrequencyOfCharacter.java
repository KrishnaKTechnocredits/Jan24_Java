package rohini_deshmane;

public class FrequencyOfCharacter {

	void printFrequencyOfchar(String givenString, char charcter) {
		int count=0;
		for(int i=0; i< givenString.length(); i++) {
			if(givenString.charAt(i) == charcter) {
				count ++;
			}
		}
		System.out.println("Frequency of "+charcter +" in "+charcter+" is "+count);
	}
	
	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.printFrequencyOfchar("technocredits", 't');
		frequencyOfCharacter.printFrequencyOfchar("technocredits", 'e');
	}
}
