package shravani_rapelli;

public class StringReverse {
	
	void printStringReverse(String input) {
		for(int index=input.length()-1; index >= 0; index--) 
			System.out.println(input.charAt(index));
	}
	
	public static void main(String[] args) {
		StringReverse stringreverse = new StringReverse();
		stringreverse.printStringReverse("techno");
	}

}
