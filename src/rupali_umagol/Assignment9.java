package rupali_umagol;

public class Assignment9 {

	void calculateTemp(int temp) {
		if (temp<-10)
			System.out.println("Extreme cold ");
		else if (temp>-10 && temp<=0)
			System.out.println("Very cold");
		else if(temp >1 && temp <=10)
			System.out.println("Cold");
		else if(temp >11 && temp <=20)
			System.out.println("Moderate");
		else if(temp >21 && temp <=30)
			System.out.println("Warm");
		else if(temp >31 && temp <=40)
			System.out.println("Hot");
	}
	public static void main(String[] args) {
		Assignment9 ass=new Assignment9();
		ass.calculateTemp(-11);
		ass.calculateTemp(-5);
		ass.calculateTemp(5);
		ass.calculateTemp(13);
		ass.calculateTemp(23);
		ass.calculateTemp(34);
		
	}
}
