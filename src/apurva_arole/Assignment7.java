package apurva_arole;

public class Assignment7 {
	void m1 (int num1, int num2)
    {
	    if(num1>num2)
	    {
	       System.out.println(num1 +" is bigger between "+ num1+ " and " + num2);
        }
		else 
		{
           System.out.println(num1 +" is bigger between "+ num1+ " and " + num2);	  
        }
    }
  
    void m2 ( int num1, int num2)
    {
	    if(num1<num2)
		{
	      System.out.println(num1+" is smaller between "+ num1+ " and " + num2);
        }
        else 
		{  
          System.out.println(num2+" is smaller between "+ num1+ " and " + num2);	
        }		  
    }
    public static void main(String [] args)
    {
        Assignment7 assignment7 = new Assignment7();
        assignment7.m1(17,10);
	    assignment7.m2(17,10);
   }
}

