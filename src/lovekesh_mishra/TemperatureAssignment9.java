package lovekesh_mishra;

class TemperatureAssignment9 {

	void temp(int degree) {

		if (degree < -10)
			System.out.println("Extreme cold");
		else if (degree >= -10 && degree <= 0)
			System.out.println("very cold");
		else if (degree >= 1 && degree <= 10)
			System.out.println("cold");
		else if (degree >= 11 && degree <= 20)
			System.out.println("Moderate");
		else if (degree >= 21 && degree <= 30)
			System.out.println("Warm");
		else if (degree > 30)
			System.out.println("Hot");
	}

	public static void main(String[] args) {
		TemperatureAssignment9 temperatureAssignment9 = new TemperatureAssignment9();
		temperatureAssignment9.temp(-14);
		temperatureAssignment9.temp(-7);
		temperatureAssignment9.temp(6);
		temperatureAssignment9.temp(14);
		temperatureAssignment9.temp(26);
		temperatureAssignment9.temp(36);
	}
}