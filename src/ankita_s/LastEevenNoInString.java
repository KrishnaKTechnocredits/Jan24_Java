package ankita_s;

public class LastEevenNoInString {
	int temp2;
	void printLastEevenNoInString(String Str) 
		{
		for(int index=0;index<Str.length();index++)
		{
			char ch = Str.charAt(index);
			boolean temp = Character.isDigit(ch);
			int temp1=Character.getNumericValue(ch);
			if(temp==true && temp1%2==0)
			{
				temp2=temp1;
				}
			}
	   System.out.println("Last even no is:- " +temp2);
	}
	
public static void main(String[]ars)
	{
		LastEevenNoInString lastEevenNoInString=new LastEevenNoInString();
		lastEevenNoInString.printLastEevenNoInString("ankita2vitthal8sambhare9");
	}
}
