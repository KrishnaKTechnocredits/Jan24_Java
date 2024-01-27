package shraddha;

class TemperatureCategories1{
	void Temperature(int temp){
		if(temp <-10){
			System.out.println("Temperature is: " + temp +" Extreme Cold");
		}
			else if(temp >=-10 && temp <=0){
				System.out.println("Temperature is: " + temp + " Very Cold");
			}
			else if(temp >=1 && temp <=10){
				System.out.println("Temperature is: " + temp + " Cold");
			}
				
			else if(temp >=11 && temp <=20){
				System.out.println("Temperature is: " + temp + " Moderate");
			}
			else if(temp >=21 && temp <=30){
				System.out.println("Temperature is: " + temp + " Warm");
			}
		else{
			System.out.println("Temperature is: " + temp + " Hot");
			}
	}
	public static void main(String[] args){
		TemperatureCategories1 temperature = new TemperatureCategories1();
		temperature.Temperature(-20);
		temperature.Temperature(-5);
		temperature.Temperature(10);
		temperature.Temperature(19);
		temperature.Temperature(21);
		temperature.Temperature(35);
	}
}