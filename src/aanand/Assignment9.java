package aanand;

public class Assignment9 {

	void temprature(int temp) {
		if(temp < -10) {
			System.out.println("Extreme Cold");
		} else if(temp >= -10 && temp <=0) {
			System.out.println("Very Cold");			
		} else if(temp >=1 && temp <= 10) {
			System.out.println("Cold");
		} else if(temp >= 11 && temp <= 20) {
			System.out.println("Moderate");
		} else if(temp >= 21 && temp <= 30) {
			System.out.println("Warm");
		} else if(temp > 30){
			System.out.println("Hot");
		}
	}
	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.temprature(-11);
		assignment9.temprature(-9);
		assignment9.temprature(0);
		assignment9.temprature(1);
		assignment9.temprature(10);
		assignment9.temprature(11);
		assignment9.temprature(20);
		assignment9.temprature(21);
		assignment9.temprature(30);
		assignment9.temprature(31);
	}

}
