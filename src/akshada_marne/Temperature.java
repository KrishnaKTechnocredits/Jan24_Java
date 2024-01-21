package akshada_marne;

class Temperature{
		
	void calculateTemperature(int temp){
		if (temp< -10){
			System.out.println(temp+" Degree celsius : Extreme Cold");
		}
		else if (temp>= -10 && temp<=0) {
			System.out.println(temp+ " Degree celsius : Very Cold");		
		}
		else if (temp>=1 && temp<=10) {
			System.out.println(temp+" Degree celsius : Cold");		
		}
		else if (temp>=11 && temp<=20) {
			System.out.println(temp+" Degree celsius : Moderate");		
		}
		else if (temp>=21 && temp<=30) {
			System.out.println(temp+" Degree celsius : Warm");		
		}
		else{
			System.out.println(temp+" Degree celsius : Hot");		
		}
	}
	
	public static void main (String args[]){
			Temperature temperature= new Temperature();
			temperature.calculateTemperature(-16);
			temperature.calculateTemperature(0);
			temperature.calculateTemperature(8);
			temperature.calculateTemperature(15);
			temperature.calculateTemperature(30);
			temperature.calculateTemperature(31);
	}
}