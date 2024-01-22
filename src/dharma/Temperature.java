package dharma;

public class Temperature {

	public void Celsius(int temp) {
		if(temp<= -10) {
			System.out.println("Extreme Cold");
		}else if(temp >=-10 && temp<=0) {
			System.out.println("Very Cold");
		}else if(temp >=1 && temp<=10) {
			System.out.println("Cold");
		}else if(temp >=11 && temp<=20) {
			System.out.println("Moderate");
		}else if(temp >=21 && temp<=30) {
			System.out.println("Warm");
		}else {
			System.out.println("Hot");
		}
		
	}
	public static void main(String []args) {
		Temperature tempreture=new Temperature();
		tempreture.Celsius(-11);
		tempreture.Celsius(-1);
		tempreture.Celsius(9);
		tempreture.Celsius(11);
		tempreture.Celsius(25);
		tempreture.Celsius(33);
		
	}
}
