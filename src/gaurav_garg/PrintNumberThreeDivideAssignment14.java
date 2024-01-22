package gaurav_garg;

public class PrintNumberThreeDivideAssignment14 {
	int count =1;
	 void printnumber(int num1,int num2)
	 {
		for(int i=num1 ;i<=num2;i++)
		{
			if (count <= 3)
			{
			if(i%3==0 && i%4==0)
			{
				 System.out.println(i);
				 count++;
			}
			}
		}
		
	 }
	 
	 public static void main(String...s)
	 {
		 PrintNumberThreeDivideAssignment14 printnumberthreedivideassignment14  = new PrintNumberThreeDivideAssignment14(); 
		 printnumberthreedivideassignment14.printnumber(10,500);
	 }
}
