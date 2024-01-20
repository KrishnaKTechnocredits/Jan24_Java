package sasmita;

public class TempetureRange {
	
	private void tempCheck(int temp){
		if(temp == -10) {
			System.out.println("Extreme Cold");
		}else if (temp >=-10 && temp <= 0) {
			System.out.println("Very Cold");
		}else if (temp >= 1 && temp <= 10) {
			System.out.println("Cold");
		}else if (temp >= 11 && temp <= 20) {
			System.out.println("Moderate");
		}else if (temp >= 21 && temp <= 30) {
			System.out.println("Warm");
		}else if(temp >= 30){
		System.out.println("Warm");	
		}
	}
    public static void main(String[]args ) {
    	TempetureRange temp = new TempetureRange();
    	System.out.println("Temperature Categories:\n");	
    	temp.tempCheck(-10);
    	temp.tempCheck(0);
    	temp.tempCheck(5);
    	temp.tempCheck(15);
    	temp.tempCheck(25);
    	temp.tempCheck(35);
    }  
}
