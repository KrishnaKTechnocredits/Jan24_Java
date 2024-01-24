package shravani_rapelli;

public class FrequencyCharacter{
	
	void printFrequencyCharacter(String input, char targetChar) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == targetChar)
				count++;
		}
		System.out.println("frequency of "+ targetChar + " in technocredits is "+ count);
	}
	
	public static void main(String[] args) {
		FrequencyCharacter frequencycharacter = new FrequencyCharacter();
		frequencycharacter.printFrequencyCharacter("technocredits", 't');
	}

}
