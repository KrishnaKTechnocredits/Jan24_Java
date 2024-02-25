package samiksha;

public class UniqueVowels {
	
	int getUniqueVowels(String str, char targetCh) {
		int count=0;
		for(int index=0; index<str.length();index++) {
			char ch =str.charAt(index);
			if(ch == targetCh) {
				count ++;
			}
		}
		return count;
	}
	
	void printUniqueVowels() {
		String str = " technocredits";
		for(int index=0; index<str.length();index++) {
			char ch= str.toLowerCase().charAt(index);
		    int count =getUniqueVowels(str, ch);
		    if(ch=='a' || ch== 'e' || ch=='i' || ch== 'o' || ch =='u') {
		    	if(count ==1) {
		    		System.out.println(ch);
		    	}
		    }
		}
	}
	
	public static void main(String[] args) {
		new UniqueVowels().printUniqueVowels();
	}
}
