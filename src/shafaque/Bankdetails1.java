package shafaque;

class Bankdetails1{
	
    int balance = 1000;
	int debitAmt,creditAmt;
	 
  void debitAmt(int amt)
 {
	  if(amt > balance)
	{
	   System.out.println("Insufficient balance");
	}
	  else if(amt<=0){
	  System.out.println("Invalid amount");
	}
	  else if(amt <= balance)
	{
	   System.out.println("User debited : " + amt);
	}
	
 }
  void creditAmt(int amt)
  {
	 if(amt > 5000)
	{
	  System.out.println("You can't deposite more than 5000 rs in one go");
	}
      else if(amt < 0)
	{
      System.out.println("Invalid amount");
	}
  }
	public static void main(String[] args)
	{
	 Bankdetails1 bankDetails1 = new Bankdetails1();
	 bankDetails1.debitAmt(3000);
	 bankDetails1.debitAmt(-700);
	 bankDetails1.debitAmt(200);
     bankDetails1.creditAmt(9000);
	 bankDetails1.creditAmt(-500);
	}
}
	
	  