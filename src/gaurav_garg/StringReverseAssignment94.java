/*
 * Input- Kajol is Working in Roche
Output- Roche in Working is Kajol
 */
package gaurav_garg;

public class StringReverseAssignment94 {

	void reverseword(String s)
	{
		String newword="";
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			newword=newword+s1[i] +" ";
		}
		System.out.print(newword.trim());
	}
	
	public static void main(String[] args) {
		String s="Kajol is Working in Roche";
       new StringReverseAssignment94 ().reverseword(s);
	}
}
