package shravani_rapelli;

public class FrequencyOfCharacter {
	
	void printFrequencyOfCharacter(String str, char ch) {
		int count=0;
		str= str.toLowerCase();
		for(int index=0; index<str.length(); index++) {
			char currentChar = str.charAt(index);
			if(currentChar == ch)
				count++;
		}
		System.out.println("frequency of t in technocrediTs teaches Technology is " + count);
	}
		
	public static void main(String[] args) {
		FrequencyOfCharacter frequencyChar = new FrequencyOfCharacter();
		frequencyChar.printFrequencyOfCharacter("technocrediTs teaches Technology", 't');
	}

}
