package hiral_purohit;

public class Tempreture {
	
	void weather(int celsius) {
		if(celsius <-10) {
			System.out.println("tempreture is: " + celsius);
			System.out.println("Extreme cold");
		}else if(celsius <0 && celsius >= -10) {
			System.out.println("tempreture is: " + celsius);
			System.out.println("Very Cold");
		}else if(celsius >=1 && celsius <= 10) {
			System.out.println("tempreture is: " + celsius);
			System.out.println("Cold");
		}else if(celsius >= 11 && celsius<=20) {
			System.out.println("tempreture is: " + celsius);
			System.out.println("Moderate");
		}else if(celsius>= 21 && celsius <=30) {
			System.out.println("tempreture is: " + celsius);
			System.out.println("Warm");
		}else if(celsius >=31) {
			System.out.println("tempreture is: " + celsius);
			System.out.println("Hot");
		}
	}
	
	public static void main(String[] args) {
		Tempreture tempreture = new Tempreture();
		tempreture.weather(-13);
		tempreture.weather(12);
		tempreture.weather(24);
		tempreture.weather(31);
		tempreture.weather(4);
		
	}
}
