package pramod;

public class TemperatuteAssigment9 {

	void temperature(int temperature)
	{
		if (temperature > 30)
		{
			System.out.println("Hot");
		}else if(temperature >=21 && temperature <=30) {
			System.out.println("Warm");
		}else if(temperature >=11 && temperature <=20) {
			System.out.println("moderate");
		}else if(temperature >=1 && temperature <=10) {
			System.out.println("cold");
		}else if(temperature <=0 && temperature >=- 10) {
			System.out.println("very cold");
	    }else {
	    	System.out.println("Extreme cold");
	    }    	
	}
	
   public static void main(String...s) {
	// TODO Auto-generated method stub
	   TemperatuteAssigment9 temperatuteassigment9 =new TemperatuteAssigment9();
	   temperatuteassigment9.temperature(50);
	   temperatuteassigment9.temperature(30);
	   temperatuteassigment9.temperature(25);
	   temperatuteassigment9.temperature(10);
	   temperatuteassigment9.temperature(-6);
	   temperatuteassigment9.temperature(-15);
}
}
