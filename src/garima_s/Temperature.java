package garima_s;

 class Temperature {

	void printTemperature(int temperature){
		if (temperature > 30)
			System.out.println("Hot");
		else if(temperature >=21 && temperature <=30)
			System.out.println("Warm");
		else if(temperature >=11 && temperature <=20)
			System.out.println("moderate");
		else if(temperature >=1 && temperature <=10)
			System.out.println("cold");
		else if(temperature <=0 && temperature >= -10)
			System.out.println("very cold");
		else 
			System.out.println("Extreme cold");   	
		}
		
	public static void main(String[] args) {
		Temperature temperature =new Temperature();
		temperature.printTemperature(-10);
		temperature.printTemperature(45);
		temperature.printTemperature(5);
		temperature.printTemperature(12);
		temperature.printTemperature(25);
		temperature.printTemperature(-90);
	   }
}
