package puja_poreddiwar;

public class RemoveVowelsChar {

	void removeVowelsfromString(String str) 
	{
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				String temp = String.valueOf(ch);
				str = str.replace(temp, "*");
			}
			str = str.replace("*", "");
		}
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		RemoveVowelsChar vowels = new RemoveVowelsChar();
		vowels.removeVowelsfromString("technocredits");
	}

}
