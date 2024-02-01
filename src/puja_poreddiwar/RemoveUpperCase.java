package puja_poreddiwar;

public class RemoveUpperCase {

	void removeUppercaseChar(String str) 
	{
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) 
			{
				String temp = String.valueOf(ch);
				str = str.replace(temp, "*");
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveUpperCase uppercase = new RemoveUpperCase();
		uppercase.removeUppercaseChar("TechNoCREdits");
	}
}
