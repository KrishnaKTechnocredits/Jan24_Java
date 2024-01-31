package pramod;

public class StringIndexOf_LastIndexOfAssignment25 {

	public static void main(String args[])
	{
		StringIndexOf_LastIndexOfAssignment25 string1 = new StringIndexOf_LastIndexOfAssignment25();
		string1.stringFunctionAssignment("technocredits");	
	}

	void stringFunctionAssignment(String str) {
		for(int i =0; i<str.length();i++)
		{
			char chr=str.charAt(i);
			if (str.indexOf(chr) == str.lastIndexOf(chr)) 
				System.out.print(str.charAt(i));
		}	
	}
}
