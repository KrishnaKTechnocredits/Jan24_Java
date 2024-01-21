package suresh;

class Bank
{
		int balance = 1000;
		
		void debit(int a)
		{
			balance = balance -a;
		}
		void credit(int a)
		{
		balance = balance + a;
		
		}
		void display()
		{
		System.out.println(balance);
		}
	public static void main(String[] args)
		{
			Bank bank = new Bank();
			bank. debit(200);
			bank.credit(500);
			bank.credit(200);
			bank. debit(700);
			bank.display();
		}
}
		
			