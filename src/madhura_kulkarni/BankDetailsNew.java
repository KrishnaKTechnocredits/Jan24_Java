package madhura_kulkarni;

class BankDetailsNew
{
	int balance=1000;

	void debitAmt(int amt)
	{
		if (amt > balance)
		{
            System.out.println("Insufficient balance");
        }
		else if (amt <= 0) 
		{
            System.out.println("Invalid Amount");
        } 
		else if(amt<= balance)
		{
            balance = balance - amt;
			System.out.println("Debited amount= "+amt+"\nAvailable balance= "+balance);
        }
	}
	
	void creditAmt(int amt)
	{
		if (amt > 5000)
		{
            System.out.println("You can't deposit more than 5000 in one go!");
        }
		else if (amt <= 0)
		{
			System.out.println("Invalid Amount");
		}
		else
		{
			balance = balance + amt;
			System.out.println("Credited amount= "+amt+"\nAvailable balance= "+balance);
		}
	}
	
	public static void main(String[] args)
	{
		BankDetailsNew bankaccountdetails = new BankDetailsNew();
		bankaccountdetails.debitAmt(300);
	    bankaccountdetails.debitAmt(2500);
		bankaccountdetails.debitAmt(700);
	    bankaccountdetails.creditAmt(500);
	    bankaccountdetails.creditAmt(-50);
	}

}










