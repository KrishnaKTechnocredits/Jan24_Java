package shafaque;

public class ArrayLength {

	void printlength(String[] arr)
	{
		for(int i=0; i< arr.length;i++)
		{
			String str = arr[i];
			char ch = str.charAt(0);
			if(str.length() > 5 && Character.isUpperCase(ch))
			{
				System.out.println(str);
			}
		}
	}	
		
		public static void main(String[] args)
		{
			String[] str = {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol"};
			new ArrayLength().printlength(str);
		}
	}

