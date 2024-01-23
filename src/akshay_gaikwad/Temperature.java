package akshay_gaikwad;

public class Temperature {
	
	void checkWeather(int temp) {
		if (temp < -10) {
			System.out.println("Extreme Cold");
		} else if (temp <= 0 ) {
			System.out.println("Very Cold");
		} else if (temp <= 10) {
			System.out.println("Cold");
		} else if (temp <= 20) {
			System.out.println("Moderate");
		} else if (temp <= 30) {
			System.out.println("Warm");
		} else {
			System.out.println("Hot");
		}
	}
	
	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		temperature.checkWeather(-15);
		temperature.checkWeather(-10);
		temperature.checkWeather(0);
		temperature.checkWeather(5);
		temperature.checkWeather(20);
		temperature.checkWeather(25);
		temperature.checkWeather(31);
	}
}
