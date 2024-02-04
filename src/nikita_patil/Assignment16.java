package nikita_patil;

public class Assignment16 {
	int sum =0;
	int count;
	int avg =0;
	
	void sumandavg(int startRange,int endRange)
	{
		System.out.println("numbers which are are divisible by 5 & 7 ");
		for(int num=startRange;num<=endRange;num++)
		{
			if(num%5==0 && num%7==0)
			{
				count++;
				sum=sum+num;
				avg=sum/count;
				System.out.print(num);
			}
		}
		System.out.println("sum is " +sum);
		System.out.println("Average is :" +avg);
		
	}
	public static void main(String[] args) {
		Assignment16 a = new Assignment16();
		a.sumandavg(1,100);
	}
}
