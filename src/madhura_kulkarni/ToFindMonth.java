package madhura_kulkarni;

public class ToFindMonth {

	public static void main(String[] args) {
		ToFindMonth tofindmonth= new ToFindMonth();
		tofindmonth.printmonth(5);
		tofindmonth.printmonth(1);
		tofindmonth.printmonth(8);
		tofindmonth.printmonth(-2);
	}
	void printmonth(int monthindex)
	{
		if(monthindex<=0 || monthindex>12)
			System.out.println("Invalid index");
		else if(monthindex>=1 && monthindex<=4) 
		{
			System.out.println("It's Quarter 1");
			if (monthindex==1)
				System.out.println("It's a January");
			else if (monthindex==2)
				System.out.println("It's a February");
			else if (monthindex==3)
				System.out.println("It's a March");
			else if (monthindex==4)
				System.out.println("It's an April");
		}	
		else if(monthindex>=5 && monthindex<=8) 
		{
			System.out.println("It's Quarter 2");
			if (monthindex==5)
				System.out.println("It's a May");
			else if (monthindex==6)
				System.out.println("It's a June");
			else if (monthindex==7)
				System.out.println("It's a July");
			else if (monthindex==8)
				System.out.println("It's an August");
		}
		else if(monthindex>=9 && monthindex<=12) 
		{
			System.out.println("It's Quarter 3");	
			if (monthindex==9)
				System.out.println("It's a September");
			else if (monthindex==10)
				System.out.println("It's an October");
			else if (monthindex==11)
				System.out.println("It's a November");
			else if (monthindex==12)
				System.out.println("It's a December");
		}
			
	}
}
