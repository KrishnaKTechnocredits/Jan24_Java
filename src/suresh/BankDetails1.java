package suresh;

class BankDetails1
{
			int balance=1000;
		
	void debitState(int debitAmnt)
	{
			if (debitAmnt> balance)
		{
			System.out.println("Insufficient balance");
		}
			else if(debitAmnt<=balance&& debitAmnt>0)
		{
			balance =balance-debitAmnt;
			System.out.println("debited amount is "+debitAmnt);
			System.out.println("Remaining balance is "+balance);
			
		}
		else if (debitAmnt<=0)
		{
			System.out.println("invalid amount");
		}
	}	
			
	void creditState(int creditAmnt)
		{
			if (creditAmnt>=5000)
			{
			System.out.println("You can't deposite more than 5000 rs in one go");
			}
			else if(creditAmnt<5000&& creditAmnt>0)
			{
			balance= balance+ creditAmnt;
			System.out.println("credited amount is "+ creditAmnt);
			System.out.println("balance is "+balance);
			 }
			else if(creditAmnt<=0)
			{
			System.out.println("invalid amount");
			}
			
		}
	public static void main(String[] args)
	{
		BankDetails1 bankDetails1 = new BankDetails1();
		bankDetails1.debitState(10);
		bankDetails1.debitState(1200);
		bankDetails1.debitState(0);
		bankDetails1.creditState(5000);
		bankDetails1.creditState(0);
		bankDetails1.creditState(4999);
	}
}		
