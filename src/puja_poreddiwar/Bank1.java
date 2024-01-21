package puja_poreddiwar;

class Bank1{
		
		int balance = 10000;
				
	void debitamount(int amount)
	{
		if(amount > balance )
		{
			System.out.println("Insufficient balance");
		}
		if(amount <= balance){
			System.out.println("Current balance is :" + balance);
			this.balance= balance-amount;
			System.out.println("User debited :" + balance);
		}
		if (amount < 0){
			System.out.println("Invalid amount");
		}
	}
	
	void creditamount(int amount)
	{
		if(amount >= 5000)
		{
			System.out.println("You can't deposit more than 5000 rs in one go");
		}
		
		if (amount < 0){
			System.out.println(amount + " is Invalid amount");
		}
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.debitamount(8000);
		bank1.debitamount(8000);
		bank1.creditamount(10000);
		bank1.creditamount(-1000);
	}
}