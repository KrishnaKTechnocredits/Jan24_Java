package shravani_rapelli;

class BankDetails{
	
	int balance = 1000;
	
	void debitAmount(int amt)
	{
		if(amt > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else if(amt <= 0)
		{
			System.out.println("Invalid Amount");
		}
		else if(amt <= balance)
		{
			balance = balance - amt;
			System.out.println("User debited Rupees " + amt + "  Available balance is " + balance);
		}
	}
	
	void creditAmount(int amt){
		if (amt > balance){
			System.out.println("You can't deposit more than 5000 rs in one go");
		}
		else if(amt <= 0)
		{
			System.out.println("Invalid Amount");
		}
	}
		
	public static void main(String[] args)
	{
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(2000);
		bankDetails.debitAmount(600);
		bankDetails.debitAmount(-10);
		bankDetails.creditAmount(3000);
		bankDetails.creditAmount(-500);
	}
}