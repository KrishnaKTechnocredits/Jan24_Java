package nikita_patil;

class Assignment7{
       
   void setdata(int num1, int num2)
	   {
	      if(num1>num2)
	   {
	      System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
	   }
	      else
	   {
	      System.out.println(num2+ " is bigger between " + num1 + " and " + num2);	    
        }
	}
  void processdata(int num1,int num2)
	 {
	     if(num1 < num2)
	 {
	     System.out.println(num1+ " is smaller between " + num1 + " and " + num2);	    
	  }
	     else
	  {
	      System.out.println(num2+ " is smaller between " + num1 + " and " + num2);	    
        }
	}
	public static void main(String[] args){
	   Assignment7 a = new Assignment7();
	   a.setdata(10,40);
	   a.processdata(10,40);
	}
}