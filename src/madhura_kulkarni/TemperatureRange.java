/*"Assignment - 9 : 20th Jan'2024

Write a program that takes a temperature in Celsius as input and categorizes it into different temperature ranges. Use if-elif statements for the categorization.

Temperature Categories:

If the temperature is below -10, print ""Extreme Cold"".
If the temperature is between -10 and 0 (inclusive), print ""Very Cold"".
If the temperature is between 1 and 10 (inclusive), print ""Cold"".
If the temperature is between 11 and 20 (inclusive), print ""Moderate"".
If the temperature is between 21 and 30 (inclusive), print ""Warm"".
If the temperature is above 30, print ""Hot""."
*/
package madhura_kulkarni;

public class TemperatureRange {

	public static void main(String[] args) {
		
		TemperatureRange temprange= new TemperatureRange();
		System.out.println("Printing the range of temperature:\n");
		temprange.checktemp(-15);
		temprange.checktemp(-6);
		temprange.checktemp(5);
		temprange.checktemp(17);
		temprange.checktemp(25);
		temprange.checktemp(33);
	}
	void checktemp(int temp)
	{
		if(temp<-10)
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
}
