package atisha;

//Remove all the uppercase character from the given string. 

class Assignment27 
{
	void upperChar(String str){
		for (int i= 0 ;i<str.length() ; i++ )
		{
			char ch = str.charAt(i);
			boolean flag = Character.isUpperCase(ch);			
				
			if (flag == false)
			{
              System.out.println(ch);
			}
		}
	}
	public static void main(String[] args) 
	{
		new Assignment27().upperChar("TechNoCrediTs");
	}
}
