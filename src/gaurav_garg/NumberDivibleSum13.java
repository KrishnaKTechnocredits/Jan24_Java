package gaurav_garg;

public class NumberDivibleSum13 {
	int dividesum;
	
 void dividesum(int num1,int num2)
 {
	for(int i=num1 ;i<=num2;i++)
	{
		if(i%5==0 && i%10==0)
		{
			dividesum = dividesum +i;
		}
	}
	 System.out.println(dividesum);
 }
 
 public static void main(String...s)
 {
	 NumberDivibleSum13  numberdiviblesum13  = new NumberDivibleSum13(); 
	 numberdiviblesum13.dividesum(10,50);
 }
 
}
