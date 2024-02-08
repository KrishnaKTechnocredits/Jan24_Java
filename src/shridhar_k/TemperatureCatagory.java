package shridhar_k;

public class TemperatureCatagory {
	
	void catagoriesTemp(int temp){
		if(temp < -10){
			System.out.println("Extreme cold");
		}else if(temp >= -10 && temp <= 0){
			System.out.println("Very cold");
		}else if(temp >= 1 && temp <= 10){
			System.out.println("cold");
		}else if(temp >= 11 && temp <= 20){
			System.out.println("moderate");
		}else if(temp >= 21 && temp <= 30){
			System.out.println("Warm");
		}else{
			System.out.println("Hot");
		}
	}
	
	public static void main (String[] arg){
		TemperatureCatagory temperatureCatagory = new TemperatureCatagory();
		temperatureCatagory.catagoriesTemp(-10);
		temperatureCatagory.catagoriesTemp(-11);
		temperatureCatagory.catagoriesTemp(0);
		temperatureCatagory.catagoriesTemp(1);
		temperatureCatagory.catagoriesTemp(40);
	}
	

}
