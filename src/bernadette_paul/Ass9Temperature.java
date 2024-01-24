package bernadette_paul;

public class Ass9Temperature {
	
	void tempCalculator(int min) {
		if (min <= -10 ) {
			System.out.println("Extreme Cold");
		}else if (min >= -10 && min <= 0 ){
			System.out.println("Very Cold");
		}else if (min >= 1 && min <= 10 ){
			System.out.println("Cold");
		}else if (min >= 11 && min <= 20 ){
			System.out.println("Moderate");
		}else if (min >= 21 && min <= 30 ){
			System.out.println("Warm");
		}else if (min >=31 ){
			System.out.println("Hot");
		}
	}
	
	public static void main(String[] args){
		Ass9Temperature ass9Temperature = new Ass9Temperature();
		ass9Temperature.tempCalculator(-20);
		ass9Temperature.tempCalculator(-5);
		ass9Temperature.tempCalculator(10);
		ass9Temperature.tempCalculator(11);
		ass9Temperature.tempCalculator(30);
		ass9Temperature.tempCalculator(31);
	}	
}
