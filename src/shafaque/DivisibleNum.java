package shafaque;

public class DivisibleNum {
        
	void Divide(int startindex , int endindex)
	{
	  for (int num = startindex  ; num <= endindex ; num++)
	  {
		  if(num % 5 == 0 && num % 3 == 0)
		  {
			  System.out.println("Divisible by 5 and 3 numbers is " + num);
		  }
	  }
	}
	 public static void main(String[] args)
	 {
	 DivisibleNum divisiblenum = new DivisibleNum();
	 divisiblenum.Divide(5, 40);
	 }
}
	
