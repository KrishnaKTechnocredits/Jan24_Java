package sveta;

public class Assignment_9_Temperature {

	public void celsius(int cel) {
		
		if(cel < -10) {
			
			System.out.println("Extreme Cold");
			
		}else if(cel >= -10 && cel <= 0) {
			
			System.out.println("Very Cold");
			
		}else if(cel >= 1 && cel <= 10) {
			
			System.out.println("Cold");
			
		}else if(cel >= 11 && cel <= 20) {
			
			System.out.println("Moderate");
			
		}else if(cel >= 21 && cel <= 30) {
			
			System.out.println("Warm");
			
		}else {
			
			System.out.println("Hot");
		}
	}
	
	public static void main(String[] args) {
		Assignment_9_Temperature temperature= new Assignment_9_Temperature();
		temperature.celsius(-2);
		temperature.celsius(10);
		temperature.celsius(15);
		temperature.celsius(23);
		temperature.celsius(33);
		

	}

}
