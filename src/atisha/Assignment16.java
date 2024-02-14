package atisha;


//on user define the range print sum & avg of numbers  which is divisible by 5&7..

class Assignment16 
{
	int sum=0;
	int avg=0;
	int count = 0;

	void sumAvg(int firstn,int lastn){
		for (int i = firstn;i<lastn ;i++ )
		{
			if (i%5 == 0 &&  i%7 == 0)
			{
				sum=sum+i;

				count++;

				
			}
			
		}
		avg=sum/count;
		System.out.println("sum ="+sum);
		System.out.println("avg="+avg);

	}
	public static void main(String[] args) 
	{
		new Assignment16().sumAvg(1 , 110);
		
	}
}
