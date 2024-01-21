package shafaque;

class Checkdays{
       
	   void weekday(int day)
	   {
	     if(day <= 0 || day >= 7){
		 System.out.println("Invalid day");}
	     
		 else if(day >= 1 || day <=5)
		 {
		 System.out.println("Its Weekday");}
		 if(day == 1){
		 System.out.println("Thrudsay");}
		 else if(day == 2){
		 System.out.println("Tuesday");}
		 else if(day ==3){
		 System.out.println("Wednesday");}
		 else if(day == 4){
		 System.out.println("Thrudsay");}
		 else if(day == 5){
		 System.out.println("Friday");}
		}
		 
		 
        void weekend(int day)
		{
		 if (day >= 6 || day >=7)
		 {
		System.out.println("Its Weekend");}
		 else if(day == 6)
		 {
		 System.out.println("Saturday");}
		 else if(day == 7){
		 System.out.println("Sunday");}
		}
		
		public static void main(String[] args)
	   {
	     Checkdays checkdays = new Checkdays();
		 checkdays.weekday(0);
		 checkdays.weekday(5);
		 checkdays.weekend(9);
		 
		
	   }
	 }
		 