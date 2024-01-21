package sveta;

public class Temperature {

	public void Celsius(int cel) {
		
		if(cel <= -10) {
			System.out.println("Extreme Cold");
		}else if(cel >= -10 && cel <= 0){
			System.out.println("Very cold");
		}else if(cel >= 1 && cel <= 10){
			System.out.println("Cold");
		}else if(cel >= 11 && cel <= 20){
			System.out.println("Moderate");
		}else if(cel >= 21 && cel <= 30){
			System.out.println("Warm");
		}else {
			System.out.println("Hot");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature temp = new Temperature();
		temp.Celsius(-11);
		temp.Celsius(-1);
		temp.Celsius(9);
		temp.Celsius(15);
		temp.Celsius(25);
		temp.Celsius(35);
	}

}
