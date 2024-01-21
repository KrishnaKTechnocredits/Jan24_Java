package shafaque;

class Checkmonth
{ 
  void quarters(int value)
  {
   if(value >= 1 && value <= 3){
     System.out.println("Quarter 1");
   if(value == 1)
   System.out.println("January");
   else if (value == 2)
   System.out.println("February");
   else
     System.out.println("March");
    }else if(value >= 4 && value <= 6)
   {
     System.out.println("Quarter 2");
   if(value == 4)
	  System.out.println("April");
   else if (value == 5)
	  System.out.println("May");
   else
	   System.out.println("June");
   }else if(value >= 7 && value <= 9)
   {
      System.out.println("Quarter 3");
   if(value == 7)
   System.out.println("July");
   else if(value == 8)
   System.out.println("August");
	else
	System.out.println("September");
    }else if(value >= 10 && value <= 12)
	{
	  System.out.println("Quarter 4");
	if (value == 10)
	System.out.println("October");
    else if(value == 11)
	System.out.println("November");
	 else 
	 System.out.println("December");
    }
  }
	
    public static void main(String[] args)
	 {
      Checkmonth checkmonth = new Checkmonth();
	  checkmonth.quarters(2);
	  checkmonth.quarters(6);
	  checkmonth.quarters(8);
	  checkmonth.quarters(12);
	  }
}
       	   
   
   
   
      
   