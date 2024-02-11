package rohit_sutar;

/*
 * Assignment - 25 : 29th Jan'2024
 * Print all the duplicate characters from the given String.
 * input = "aakanksha";
 * output : ak 
 */

public class Assignment25 {

	void findDupicateCharacters(String strInput) {
		String tempStr = "";
		for (int i = 0 ; i < strInput.length() ; i++) {
			char ch = strInput.charAt(i);
			int num1 = strInput.indexOf(ch);
			int num2 = strInput.lastIndexOf(ch);
			//System.out.println(ch);
			//System.out.println(num1);
			//System.out.println(num2);
			
			if (i == strInput.indexOf(ch)) {
				if (num1 != num2)
					tempStr = tempStr + ch;
			}
		}
		System.out.print("Duplicate Characters in provided String : " + tempStr);
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.findDupicateCharacters("aakanksha");
	}
}
