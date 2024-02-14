package atisha;

//on user defined range print first 3 numberws which is divisible by 3&4..

class Assignment15 
{
   void numberPrint(int first ,int last){
	int count = 0;
	for (int i= first ;count<3 ;i++ )
	{
		if (i%3 == 0 && i%4==0)
		{  
			System.out.println(i);

			count++;
		}
	}
   }

	public static void main(String[] args) 
	{
		System.out.println("That numbers which are divisible by 3 & 4 :" );
		new Assignment15().numberPrint(10,500);
		
	}
}
