package atisha;

//on user defined range print last number which is divisible by 5&9..

class Assignment13 
{
   void numberPrint(int first ,int last){
	int count = 0;
	for (int i= last ;count<1 ;i-- )
	{
		if (i%5 == 0 && i%9==0)
		{  
			System.out.println("The number which is divisible by 5 & 9 is : "+i );

			count++;
		}
		
	}
   }

	public static void main(String[] args) 
	{
		new Assignment13().numberPrint(5,100);
		
	}

}
