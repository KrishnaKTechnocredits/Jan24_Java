package phenol_verma;

public class Temperature {
	void tempCheck(int temp) {
		if(temp < -10 ) {
			System.out.println("Extreme Cold");
		} else if(temp >= -10 && temp <= 0) {
			System.out.println("Very Cold");
		} else if(temp >= 1 && temp <= 10) {
			System.out.println("Cold");
		} else if(temp >= 11 && temp <= 20) {
			System.out.println("Moderate");
		} else if(temp >= 21 && temp <= 30) {
			System.out.println("Warm");
		} else 
			System.out.println("Hot");
	}

	public static void main(String[] args){
		Temperature temperature = new Temperature();
		temperature.tempCheck(-11);
		temperature.tempCheck(-9);
		temperature.tempCheck(0);
		temperature.tempCheck(2);
		temperature.tempCheck(13);
		temperature.tempCheck(21);
		temperature.tempCheck(30);
		temperature.tempCheck(35);
	}
}
