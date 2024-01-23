package ashwini_b;

/*
Assignment - 9 : 20th Jan'2024

Write a program that takes a temperature in Celsius as input and categorizes it into different temperature ranges. Use if-elif statements for the categorization.

Temperature Categories:

If the temperature is below -10, print "Extreme Cold".
If the temperature is between -10 and 0 (inclusive), print "Very Cold".
If the temperature is between 1 and 10 (inclusive), print "Cold".
If the temperature is between 11 and 20 (inclusive), print "Moderate".
If the temperature is between 21 and 30 (inclusive), print "Warm".
If the temperature is above 30, print "Hot".
*/

class Temperature{
  
  void printTemperature(int temperature){
    if(temperature < -10){
	  System.out.println("Extreme Cold");
	}
    else if(temperature >= -10 && temperature <=0 ){
	  System.out.println("Very Cold");
	}
	 else if(temperature >= 1 && temperature <= 10){
	  System.out.println("Cold");
	}
	else if(temperature >= 11 && temperature <=20){
	  System.out.println("Moderate");
	}
	else if(temperature >= 21 && temperature <=30){
	  System.out.println("Warm");
	}
	 else{
	   System.out.println("Hot");
	}
  }
	public static void main(String[] args){
	  Temperature temperature = new Temperature();
	  temperature.printTemperature(-12);
	  temperature.printTemperature(-2);
	  temperature.printTemperature(5);
	  temperature.printTemperature(15);
	  temperature.printTemperature(25);
	  temperature.printTemperature(33);
	}
}
    