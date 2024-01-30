package shraddha;

class DuplicateChar2{
	void printDuplicateCharacter2(String str1){
		String str = str1.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (index == str.indexOf(chr)) {
				if (str.indexOf(chr) != str.lastIndexOf(chr)) {
					System.out.print(str.charAt(index));
				}
			}
		}
	}
	
	public static void main(String[] args){
		DuplicateChar2 duplicateChar2 = new DuplicateChar2();
		duplicateChar2.printDuplicateCharacter2("aakanksha");
	}
}