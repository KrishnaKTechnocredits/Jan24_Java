package nisarg_patel;

public class Assignment9Temperatute {
	
	void weather(int temp) {
		if(temp <-10) {
			System.out.println("Tempreture is: " + temp);
			System.out.println("Extreme cold");
		}else if(temp <0 && temp >= -10) {
			System.out.println("Tempreture is: " + temp);
			System.out.println("Very Cold");
		}else if(temp >=1 && temp <= 10) {
			System.out.println("Tempreture is: " + temp);
			System.out.println("Cold");
		}else if(temp >= 11 && temp<=20) {
			System.out.println("Tempreture is: " + temp);
			System.out.println("Moderate");
		}else if(temp>= 21 && temp <=30) {
			System.out.println("Tempreture is: " + temp);
			System.out.println("Warm");
		}else if(temp >=31) {
			System.out.println("Tempreture is: " + temp);
			System.out.println("Hot");
		}
	}
	
   public static void main(String[] args) {
	   Assignment9Temperatute assignment9Temperatute =new Assignment9Temperatute();
	   assignment9Temperatute.weather(50);
	   assignment9Temperatute.weather(30);
	   assignment9Temperatute.weather(10);
	   assignment9Temperatute.weather(-6);
	   assignment9Temperatute.weather(-15);
}
}



	
