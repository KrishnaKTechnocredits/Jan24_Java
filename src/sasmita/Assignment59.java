//"Print the character with maximum frequency:
//input: TeeCccChH
//output: c->4"


package sasmita;

public class Assignment59 {
	
	int getCharFreq(String str, char targetCharacter) {
		int count=0;
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(Character.toLowerCase(str.charAt(index))==targetCharacter) {
				count++;
			}
		}
		return count;
	}
	void printAllcharFreq(String input) {
	int max=0;
	char targetCharacter=' ';
	for(int index=0; index<input.length();index++) {
		char ch= Character.toLowerCase(input.charAt(index));
		int count= getCharFreq(input,ch);
		if(max<count) {
			max=count;
			targetCharacter=ch;
		}
	}
	System.out.println(targetCharacter + "-->"+max);
	
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		assignment59.printAllcharFreq("TeeCccChH");

	}

}
