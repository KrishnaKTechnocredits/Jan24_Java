package suresh;

class JavaPractice 
{
	
	void days(int index)
	{
		if (index>=1 && index<=5) {
			
			System.out.println("weekdays");
		}
			 if (index==1) {
			 System.out.println("monday");}
			else if(index==2){System.out.println("Tuesday");}
			else if(index==3){System.out.println("wednesday");}
			else if(index==4){System.out.println("thurday");}
			else if(index==5){System.out.println("Friday");
			}
			
		if(index==6||index==7)
		{
			System.out.println("weekends");}
			if(index==6){System.out.println("saturday");}
			else 
				{
				System.out.println("sunday");
			}
		}
	public static void main (String[] args) 
	{
		JavaPractice javaPractice = new JavaPractice();
		javaPractice.days(4);
		javaPractice.days(6);
	}
}	