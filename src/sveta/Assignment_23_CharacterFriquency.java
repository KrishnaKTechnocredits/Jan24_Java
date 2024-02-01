/*Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 
(print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis 
*/
package sveta;

public class Assignment_23_CharacterFriquency {

	public static void frequencyOfCharacter() {
		String str="technocredits";
		
		char ch=' ';
		int frequency = 0;
		for(int i=0;i<=str.length()-1;i++) {
			ch =  str.charAt(i);
            if(ch == str.charAt(i)) {
                ++frequency;
            }
            
        }
		System.out.println("Frequency of " + ch + " = " + frequency);
       
    }

	
	public static void main(String[] args) {
		frequencyOfCharacter();

	}

}
