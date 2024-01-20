package puja_poreddiwar;

public class Temperature {

	void weather(int temp) {
		 if(temp <= -10) {
			 System.out.println("Temperature is Extreme Cold : " +temp);
		 }else if(temp >= -10 && temp <= 0) {
			 System.out.println("Temperature is Very Cold : " +temp);
		 }else if(temp >= 1 && temp <= 10) {
			 System.out.println("Temperature is Cold : " +temp);
		 }else if(temp >= 11 && temp <= 20) {
			 System.out.println("Temperature is Moderate : " +temp);
		 }else if(temp >= 21 && temp <= 30) {
			 System.out.println("Temperature is Warm  : " +temp);
		 }else
		 {
			 System.out.println("Temperature is Hot : " +temp);
		 }
	}
	
	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		temperature.weather(-10);
		temperature.weather(0);
		temperature.weather(6);
		temperature.weather(15);
		temperature.weather(28);
		temperature.weather(43);
		
	}

}
