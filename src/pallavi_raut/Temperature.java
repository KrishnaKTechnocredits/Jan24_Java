/*Assignment - 9 : 20th Jan'2024

Write a program that takes a temperature in Celsius as input and categorizes it into different temperature ranges. Use if-elif statements for the categorization.
Temperature Categories:
If the temperature is below -10, print "Extreme Cold".
If the temperature is between -10 and 0 (inclusive), print "Very Cold".
If the temperature is between 1 and 10 (inclusive), print "Cold".
If the temperature is between 11 and 20 (inclusive), print "Moderate".
If the temperature is between 21 and 30 (inclusive), print "Warm".
If the temperature is above 30, print "Hot".
------------------------------------------------------------------------------*/
package pallavi_raut;
class Temperature{
	
	void tempRange(int tempValue){
		if (tempValue < -10){
			System.out.println("It's " + tempValue + " celcius. Extreme Cold!");
		}
		else if (tempValue >= -10 && tempValue <=0){
			System.out.println("It's " + tempValue + " celcius. Very Cold!");
		}
		else if (tempValue >= 1 && tempValue <= 10){
			System.out.println("It's " + tempValue + " celcius. Cold!");
		}
		else if (tempValue >= 11 && tempValue < 20){
			System.out.println("It's " + tempValue + " celcius. Moderate!");
		}
		else if (tempValue >= 21 && tempValue <= 30){
			System.out.println("It's " + tempValue + " celcius. Warm!");
		}
		else
			System.out.println("It's " + tempValue + " celcius.It's a Hot!");
		}	

	public static void main(String[] args){
		Temperature tempcategory=new Temperature();
		tempcategory.tempRange(-11);
		tempcategory.tempRange(-9);
		tempcategory.tempRange(5);
		tempcategory.tempRange(18);
		tempcategory.tempRange(25);
		tempcategory.tempRange(35);
	}
}





