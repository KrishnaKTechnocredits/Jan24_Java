package priya_t;

public class CheckTemperature {

	public void TempRange(int temp) 
	{
		if(temp<=-10) 
		       System.out.println("Extreme Cold");
		else if (temp>=-10 && temp<=0)
		       System.out.println("Very Cold");
	    else if (temp>=1 && temp<=10)
		       System.out.println("Cold");
		else if (temp>=11 && temp<=20)
			   System.out.println("Moderate");
		else if (temp>=21 && temp<=30)
			   System.out.println("Warm");
		else if (temp>30)
			   System.out.println("Hot");
		
	}



	public static void main(String[] args) {
		CheckTemperature checktemp = new CheckTemperature();
		System.out.println("Print Temperature Categories:\n");
		checktemp.TempRange(-18);
		checktemp.TempRange(-6);
		checktemp.TempRange(5);
		checktemp.TempRange(15);
		checktemp.TempRange(25);
		checktemp.TempRange(32);

	}

}
