package apurva_arole;

public class Assignment9 {
	void printtemp(int temp){
		if(temp<-10)
		    System.out.println("Extreme cold");
		else if(temp>=-10 && temp<=0)
			System.out.println("Very cold");
		else if(temp>=1 && temp<=10)
			System.out.println("Cold");
		else if(temp>=11 && temp<=20)
			System.out.println("Moderate");
		else if(temp>=21 && temp<=30)
		    System.out.println("Warm");
		else if(temp>30)
			System.out.println("Hot");
		}
		public static void main(String[] args){
		    Assignment9 assignment9= new Assignment9();
		    System.out.println("printing the range of temperature:");
		    assignment9.printtemp(-15);
		    assignment9.printtemp(4);
		    assignment9.printtemp(32);
		    assignment9.printtemp(12);
		}
}
