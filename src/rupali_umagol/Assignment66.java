/*"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*" */

package rupali_umagol;

public class Assignment66 {
	public static void main(String[] args) {
		String str="H2i H3el4lo P4un2e5";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) 
		str=str.replace(Character.toString(ch),"*");
		}
		System.out.println(str);
	}
}