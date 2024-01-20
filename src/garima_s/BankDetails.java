package garima_s;

class BankDetails
{
	int balance=1000;
	
	void debitAmount(int amount)
	{
		if(amount > balance)
		{
			System.out.println("Insufficient balance");
		}
		else if(amount <= 0)
		{
			System.out.println("Invalid amount");
		}
		else if(amount <= balance)
		{
			balance = balance - amount;
			System.out.println("User debited : " + amount + " Bank Balance : " + balance);
		}	
	}
	
	void creditAmount(int amount)
	{
		if(amount > 5000)
		{
			System.out.println("You can't deposite more than Rs5000 in one go");
		}
		else if(amount <= 0)
		{
			System.out.println("Invalid amount");
		}
		else
		{
			balance = balance + amount;
			System.out.println("User Credited : " + 3000 + " Bank Balance : " + balance);
		}
	}
	
	public static void main(String[] args)
	{
		BankDetails	bankDetails= new BankDetails();
		bankDetails.debitAmount(-100);
		bankDetails.creditAmount(5200);
		bankDetails.creditAmount(3000);
		bankDetails.creditAmount(0);
		bankDetails.debitAmount(2000);
		bankDetails.debitAmount(300);
	}
}