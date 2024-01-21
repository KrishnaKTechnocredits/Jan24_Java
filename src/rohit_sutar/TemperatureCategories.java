package rohit_sutar;

class TemperatureCategories{

	void takeTemperature(double temperature){
		System.out.println("Entered Temperature : "+temperature);
		if(temperature < -10){
			System.out.println("Extreme Cold");
		}else if(temperature > -10 && temperature < 0){
			System.out.println("Very Cold");
		}else if(temperature >= 1 && temperature <= 10){
			System.out.println("Cold");
		}else if(temperature >= 11 && temperature <= 20){
			System.out.println("Moderate");
		}else if(temperature >= 21 && temperature <= 30){
			System.out.println("Warm");
		}else
			System.out.println("Hot");
	}
	
	public static void main(String args[]){
		TemperatureCategories temperatureCategories = new TemperatureCategories();
		temperatureCategories.takeTemperature(-11.6);
		temperatureCategories.takeTemperature(-5);
		temperatureCategories.takeTemperature(5);
		temperatureCategories.takeTemperature(15);
		temperatureCategories.takeTemperature(25);
		temperatureCategories.takeTemperature(35);
	}
}