package shramika_vaidya;

class Weather{

float temperature;

	void displayTemp(float temperature){
		if(temperature < -10){
			System.out.println("Weather is Extream cold");
		}
		else if(temperature == -10 || temperature <= 0){
			System.out.println("Weather is Very cold");
		}
		else if(temperature == 1 || temperature <= 10){
			System.out.println("Weather is cold");
		}
		else if(temperature == 11 || temperature<= 20){
			System.out.println("Weather is Moderate");
		}
		else if (temperature == 21 || temperature <= 30){
			System.out.println("Weather is Warm");
		}
		else if(temperature > 30){
			System.out.println("Weather is Hot");
		}
	}
	
	public static void main(String[] args){
		Weather weather = new Weather();
		weather.displayTemp(-12);
		weather.displayTemp(-3);
		weather.displayTemp(8);
		weather.displayTemp(21);
		weather.displayTemp(31);
		weather.displayTemp(15);
	}
}
		

