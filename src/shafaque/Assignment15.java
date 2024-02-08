package shafaque;

public class Assignment15 {
	int count = 0;
       void div3_4(int startindex , int endindex)
       {
    	   System.out.println("First 3 numbers divisible by 3 and 4 is ");
    	   for (int num = startindex; num <= endindex ; num++)
    	   {
    		   if(num % 3 == 0 && num % 4 == 0)
    		   {
    			 System.out.println(num);
    			  count++;
    		   }
    		   if (count == 3)
    			  break;
    		   } 
    		   
    	   }
public static void main(String[] args)
{
	Assignment15 assignment15 = new Assignment15();
	assignment15.div3_4(10,500);
	
}
}
