package shafaque;

public class EvenNumbers {
	
    void E1(int startindex , int endindex)
	{
	 for(int num = startindex ; num <= endindex ; num++)
	 { 
	  if(num % 2 == 0)
	  {
	   System.out.println(num);
	  }
	  }
	}
	
	public static void main(String[] args)
	{
	EvenNumbers evennumbers = new EvenNumbers();
	evennumbers.E1(10,15);
	}
}

