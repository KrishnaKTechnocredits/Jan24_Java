package suresh.array;

public class PrintAllStringwithChar5 {

	
	void getPrintCharOfFive(String[]input)
	{
		for(int i=0;i<input.length;i++)
		{
			boolean flag=input[i].length()>5 && Character.isUpperCase(input[i].charAt(0));
			
			if(flag==true)
			{
				
				System.out.println(input[i]);
			}
			
		}
	}
	
	
	public static void main(String[]args)
	{
		String[] arry= {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"};
		new PrintAllStringwithChar5().getPrintCharOfFive(arry);
	}
}

