package nikita_patil;
class Bankdetail1{
      
	    int balance = 1000;
	    int creditAmt;
	    int debitAmt;
	    int amt;
		
	 void debitAmt(int amt)
	    {
	          if (amt > balance)
		{
		     System.out.println("Insufficient Balance");
		}
		    else if(amt < 0)
	   {
		    System.out.println("Invalid Amount");
		}
		
		    else if(amt <= balance)
		{
			balance = balance - amt;
	        System.out.println("User debited" + amt);
		}
}
	   		
	 void creditAmt(int amt)
	   {
			 if (amt >=  500)
	   {
		     System.out.println("you can't deposit 500 rs in one go");
		}
		    else if ( amt < 0)
		{
			  System.out.println("Invalid Amount");
		  }
	  }
	public static void main(String[] args){
		  Bankdetail1 b1 = new Bankdetail1();
	      b1.debitAmt(2000);
		  b1.debitAmt(400);
		  b1.debitAmt(-20);
          b1.creditAmt(3000);
		  b1.creditAmt(-500);
		}
}
		