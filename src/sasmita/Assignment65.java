//"Remove digits and whitespace characters:
//input: H2i H3el4lo P4un2e5
//output: HiHelloPune"

package sasmita;

public class Assignment65 {

	void removeDigitAndSpace(String str) {
		String output="";
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(!Character.isDigit(ch)&& !(str.charAt(index)==' ')) {
				output= output+ch;
				
			}			
		}
		System.out.println(output);
	}

	public static void main(String[] args) {	
		Assignment65 assignment65= new Assignment65();
		assignment65.removeDigitAndSpace("H2i H3el4lo P4un2e5");
	}

}
