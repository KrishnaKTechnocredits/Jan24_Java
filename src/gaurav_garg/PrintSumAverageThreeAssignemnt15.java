package gaurav_garg;

public class PrintSumAverageThreeAssignemnt15 {
	int count =1;
	int sum;
	 void printnumber(int num1,int num2)
	 {
		 System.out.println("Number are -:  ");
		for(int i=num1 ;i<=num2;i++)
		{
			if (count <= 3)
			{
			if(i%5==0 && i%7==0)
			{
				 System.out.println(i);
				 sum=sum+i;
				 count++;
			}
			}
		}
		System.out.println("Found " + (count-1) + " which are divided by 5 and 7");
		System.out.println("sum = " + sum);
		System.out.println("average =" + (sum/(count-1)) );
	 }
	 
	 public static void main(String...s)
	 {
		 PrintSumAverageThreeAssignemnt15 printsumaveragethreeassignemnt15  = new PrintSumAverageThreeAssignemnt15(); 
		 printsumaveragethreeassignemnt15.printnumber(1,110);
	 }
}
