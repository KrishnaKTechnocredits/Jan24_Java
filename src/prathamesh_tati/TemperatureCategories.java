package prathamesh_tati;

public class TemperatureCategories {

	void temperatureStatus(int temperature) {
		if (temperature < -10)
			System.out.println("Extreme Cold");
		else if (temperature >= -10 && temperature <= 0)
			System.out.println("Very Cold");
		else if (temperature >= 1 && temperature <= 10)
			System.out.println("Cold");
		else if (temperature >= 11 && temperature <= 20)
			System.out.println("Moderate");
		else if (temperature >= 21 && temperature <= 30)
			System.out.println("Warm");
		else
			System.out.println("Hot");
	}

	public static void main(String[] args) {
		TemperatureCategories temperatureCategories = new TemperatureCategories();
		temperatureCategories.temperatureStatus(-30);
		temperatureCategories.temperatureStatus(0);
		temperatureCategories.temperatureStatus(1);
		temperatureCategories.temperatureStatus(11);
		temperatureCategories.temperatureStatus(15);
		temperatureCategories.temperatureStatus(30);
		temperatureCategories.temperatureStatus(45);
	}
}