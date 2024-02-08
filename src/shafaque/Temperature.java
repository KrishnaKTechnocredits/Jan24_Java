package shafaque;

class Temperature{
      
	  void printtemprature(int temperature)
	  {
	   if (temperature < -10)
	   {
	   System.out.println("Extreme Cold");}
	   else if (temperature >= -10 && temperature <=0){
	   System.out.println("Very Cold");}
	   else if (temperature >=1 && temperature <=10){
	   System.out.println("Cold");}
	   else if (temperature >=11 && temperature <=20){
	   System.out.println("Moderate");}
	   else if (temperature >=21 && temperature <=30){
	   System.out.println("Warm");}
	   else{
	    System.out.println("Hot");}
	  }
	  
	  public static void main(String[] args)
	  {
	    Temperature temperature = new Temperature();
		temperature.printtemprature(-12);
		temperature.printtemprature(-3);
		temperature.printtemprature(6);
		temperature.printtemprature(13);
		temperature.printtemprature(27);
		temperature.printtemprature(38);
      }
	
}