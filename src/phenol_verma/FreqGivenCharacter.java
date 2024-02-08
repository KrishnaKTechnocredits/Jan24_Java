package phenol_verma;

public class FreqGivenCharacter {
	int countchar = 0;

	void string(char chr, String str) {
		for (int index = 0; index < str.length(); index++) {

			if (str.charAt(index) == chr) {
				countchar++;
			}
		}
		System.out.println("frequency of t in technocredits is " + countchar);
	}

	public static void main(String[] args) {
		FreqGivenCharacter freqGivenCharacter = new FreqGivenCharacter();
		freqGivenCharacter.string('t', "technocredits");
	}
}
