package nikita_patil;

public class Assignment13 {
	
	int count;
	void printlast(int startRange, int endRange)
	{
		for(int num = startRange;num<=endRange;num--) 
		{
		   if(num%9 == 0 && num%5 == 0)
		    {
	     
			System.out.println("Last number divisible by 5 & 9 is : " + num);
			break;
				
			}
		}
	}
	public static void main(String[] args) {
		Assignment13 a = new Assignment13();
		a.printlast(5,100);
	}
}



