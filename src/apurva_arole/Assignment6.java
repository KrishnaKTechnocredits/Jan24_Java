package apurva_arole;

public class Assignment6 {
	int balance= 1000;
	 int debitamt;
	 int creditamt;
	 int amt;
	
   void debitamt(int amt)
    {
	    if(amt>balance)
		{
         System.out.println("Insufficient Balance");
		}
		else if(amt<0)
		{
		  System.out.println("Invalid Amount");	
		}
		else if (amt<balance)
		{	
		  balance=balance+amt;
		  System.out.println("User debited the amount" + amt);
		}
	 }	
	void creditamt(int amt)
	 {
       if(amt>600){
       	balance = balance +amt;
         System.out.println("Insufficient Balance");
		}
       else if(amt <0)
       {
         System.out.println("Invalid Amount");	
		}
	 }
   public static void main(String [] args)
   {
       Assignment6 assignment6 = new Assignment6();
       assignment6.debitamt(5000);
	   assignment6.debitamt(500);
	   assignment6.debitamt(-50);
	   assignment6.creditamt(900);
	   assignment6.creditamt(-70);
   }
}   

