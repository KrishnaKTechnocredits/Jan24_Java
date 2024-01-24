/*Assignment - 17 : 23th Jan'2024 
 1. Print the frequency of the given character from the given String.*/

package prathamesh_tati;

public class FrequencyOfCharacter {

	int count;

	void characterFrequency() {
		String str = "technocredits";
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 't')
				count++;
		}
		System.out.println("frequency of t in technocredits is " + count +".");
	}

	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.characterFrequency();
	}
}