package ankita_s;

public class Temperature {
	void temperatureInCelsius(int Celsius) {
		if (Celsius < -10)
			System.out.println("Extreme Cold");
		else if (Celsius >= -10 && Celsius <= 0)
			System.out.println("Very Cold");
		else if (Celsius >= 1 && Celsius <= 10)
			System.out.println("Cold");
		else if (Celsius >= 11 && Celsius <= 20)
			System.out.println("Moderate");
		else if (Celsius >= 21 && Celsius <= 30)
			System.out.println("Warm");
		else if (Celsius > 30)
			System.out.println("Hot");
	}

	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		temperature.temperatureInCelsius(-16);
		temperature.temperatureInCelsius(0);
		temperature.temperatureInCelsius(9);
		temperature.temperatureInCelsius(15);
		temperature.temperatureInCelsius(25);
		temperature.temperatureInCelsius(40);

	}
}
