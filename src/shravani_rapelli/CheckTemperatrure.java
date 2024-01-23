package shravani_rapelli;

public class CheckTemperatrure {
	
	void temperatureCategories(int temperature) {
		if(temperature < -10)
			System.out.println("It's Extremely Cold");
		else if(temperature >= -10 && temperature <= 0)
			System.out.println("Very Cold");
		else if(temperature >= 1 && temperature <= 10)
			System.out.println("Cold");
		else if(temperature >= 11 && temperature <= 20)
			System.out.println("Moderate");
		else if(temperature >= 21 && temperature <= 30)
			System.out.println("Warm");
		else if(temperature > 30)
			System.out.println("Hot");
	}
	
	public static void main(String[] args) {
		CheckTemperatrure checktemp = new CheckTemperatrure();
		checktemp.temperatureCategories(-6);
		checktemp.temperatureCategories(12);
		checktemp.temperatureCategories(0);
		checktemp.temperatureCategories(-3);
		checktemp.temperatureCategories(26);
		checktemp.temperatureCategories(42);
		
	}
	
}
