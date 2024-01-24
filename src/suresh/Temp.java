package suresh;

public class Temp 
	
{	
	void celsius (int tmpcel)
	{
		if (tmpcel<-10)
		{
			System.out.println("Extream cold");
		}
		else if(tmpcel>=-10 && tmpcel<=0)
		{
			System.out.println("Very cold");	
		}
		else if(tmpcel>=1 && tmpcel<=10)
		{
			System.out.println("cold");
		}
		else if(tmpcel>=11 && tmpcel<=20)
		{
			System.out.println("Moderate");
		}
		else if(tmpcel>=21 && tmpcel<=30)
		{
			System.out.println("Warm");
		}
		else if(tmpcel>30)
		{
			System.out.println("hot");
		}
	}
	public static void main (String[] args)
	{
		Temp temp = new Temp();
		temp.celsius(-1);
		temp.celsius(4);
		temp.celsius(15);
		temp.celsius(36);
		temp.celsius(-11);
		temp.celsius(0);
	}
}	