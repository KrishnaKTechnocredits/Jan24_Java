package garima_s;

class CountOfCharacters {

	void countcharacters(String name, char targetCharacter) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			String str = name.toLowerCase();
			char ch = str.charAt(index);
			if (ch == targetCharacter) {
				count++;
			}
		}
		System.out.println("Frequency of " + targetCharacter + " in " + name + " is " + count);
	}
	
	public static void main(String[] args) {
		CountOfCharacters countOfCharacters = new CountOfCharacters();
		countOfCharacters.countcharacters("technocrediTs teaches Technology", 't');
	}

}
