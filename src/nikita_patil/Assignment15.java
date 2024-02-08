package nikita_patil;

public class Assignment15 {
	int count;
	void printfirst(int startRange,int endRange)
	{
		System.out.println("First 3 numbers divisible by 3 & 4 are : ");
		for(int num = startRange;num<=endRange;num++)
		{
			if(num%3==0 && num%4==0)
			{
				System.out.println(num);
				count++;
				if(count==3)
					break;
				
			}
		}
	}
	public static void main(String[] args) 
	{
		Assignment15 a = new Assignment15();
		a.printfirst(10,500);
	}

}
