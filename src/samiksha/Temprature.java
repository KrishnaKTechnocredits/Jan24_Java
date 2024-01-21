package samiksha;

public class Temprature {
	
	void printTemp(int temp) {
		if(temp <= -10) {
			System.out.println("Extream cold");
		}else if(temp <= 0) {
			System.out.println("Very cold");
		}else if(temp <= 10) {
			System.out.println("cold");
		}else if(temp <= 20) {
			System.out.println("Moderate");
		}else if(temp <= 30) {
			System.out.println("Warm");
		}else if(temp < 30) {
			System.out.println("Hot");
		}
	}
	
	public static void main(String[] args) {
		Temprature temprature = new Temprature();
		temprature.printTemp(-25);
		temprature.printTemp(-5);
		temprature.printTemp(3);
		temprature.printTemp(12);
		temprature.printTemp(21);
		temprature.printTemp(30);
		temprature.printTemp(-100);
		}
}
