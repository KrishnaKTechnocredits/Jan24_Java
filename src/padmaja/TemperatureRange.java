package padmaja;

class TemperatureRange{
	void printTemperatureCategory(int tmp){
		if(tmp < -10)
			System.out.println("Extream Cold");
		else if(tmp >= -10 && tmp <= 0)
			System.out.println("Very Cold");
		else if(tmp >= 1 && tmp <= 10)
			System.out.println("Cold");
		else if(tmp >= 11 && tmp <= 20)
			System.out.println("Moderate");
		else if(tmp >= 21 && tmp <= 30)
			System.out.println("Warm");
		else if(tmp >30)
			System.out.println("Hot");
	}
	
	public static void main(String[] args){
		TemperatureRange temperatureRange = new TemperatureRange();
		temperatureRange.printTemperatureCategory(-15);
		temperatureRange.printTemperatureCategory(-5);
		temperatureRange.printTemperatureCategory(0);
		temperatureRange.printTemperatureCategory(6);
		temperatureRange.printTemperatureCategory(15);
		temperatureRange.printTemperatureCategory(25);
		temperatureRange.printTemperatureCategory(35);
	}	
}