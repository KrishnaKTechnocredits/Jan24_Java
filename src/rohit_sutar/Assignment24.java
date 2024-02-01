package rohit_sutar;

public class Assignment24 {

	void printUniqueCharacters(String strInput){
		int strLength = strInput.length();
		int count = 0;
		System.out.println("Provided String : "+strInput);
		System.out.println();
		System.out.println("Below mentioned are the Unique Characters from provided String");
		for(int i = 0 ; i <= strLength -1 ; i++){
			char ch = strInput.charAt(i);
			
			if(strInput.indexOf(ch) == strInput.lastIndexOf(ch)) {
				System.out.print(ch);
				count++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.printUniqueCharacters("technocredits");
	}
}
