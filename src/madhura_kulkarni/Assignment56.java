/*Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"*/
package madhura_kulkarni;

public class Assignment56 {
	
	void printUniqueVowels(String input) {
		input=input.toLowerCase();
		System.out.print("Printing unique vowels in string: ");
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				if(input.indexOf(ch)==input.lastIndexOf(ch))
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		String str="technocredits";
new Assignment56().printUniqueVowels(str);
	}

}
