package rohini_deshmane;

public class TemperatureDetails {
	
	void findTempCategories(int temperature) {
		if(temperature < -10) {
			System.out.println("Extream Cold");
		}else if(temperature >= -10 && temperature <=0) {
			System.out.println("Very Cold");
		} else if(temperature >= 1 && temperature <= 10) {
			System.out.println("Cold");
		} else if(temperature >= 11 && temperature <= 20) {
			System.out.println("Moderate");
		} else if(temperature >= 21 && temperature <= 30) {
			System.out.println("Warm");
		} else {
			System.out.println("Hot");
		}
	}
 
	public static void main(String[] args) {
		TemperatureDetails temperatureProgram = new TemperatureDetails();
		temperatureProgram.findTempCategories(-2);
		temperatureProgram.findTempCategories(-20);
		temperatureProgram.findTempCategories(45);
		temperatureProgram.findTempCategories(3);
		temperatureProgram.findTempCategories(25);
		temperatureProgram.findTempCategories(17);
	}
}