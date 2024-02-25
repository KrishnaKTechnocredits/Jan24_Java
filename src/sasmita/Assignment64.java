/*"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"
 */
package sasmita;

public class Assignment64 {

	void reArrangeString(String str) {
		String normal="";
		String specialchar="";
		for(int index=0;index<str.length();index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch)||Character.isLetter(ch)) {
				normal=normal+ch;
			}else {
				specialchar= specialchar+ch;
			}
				
		}
		System.out.println(normal+specialchar);
			
		}
		
		
		
	public static void main(String[] args) {
		Assignment64 assignment64= new Assignment64();
		assignment64.reArrangeString("-AasH?3v7i!");

		
	}

}
