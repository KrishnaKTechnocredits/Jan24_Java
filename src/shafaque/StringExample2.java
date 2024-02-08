package shafaque;

public class StringExample2 {
	

	void printUniqueChar() {
		String str = "technocredits";

		for (int index = 0; index < str.length(); index++) 
		{
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
			{
				System.out.print(ch);
			}

		}
}
	public static void main(String[] args)
	{
		new StringExample2().printUniqueChar();
	}
}
