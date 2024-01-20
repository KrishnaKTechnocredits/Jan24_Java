package gaurav_garg;


class BankAssignment3
{
	int balance = 1000;
	
	void debit(int n)
	{
		balance =balance -n;
	}
	void credit(int n)
	{
		balance=balance+n;
	}
	void display()
	{
		System.out.println("printbalance->" + balance);
	}
	
	public static void main(String...s)
	{
		BankAssignment3 bankassignment3 =new BankAssignment3();
		bankassignment3.debit(200);
		bankassignment3.credit(500);
		bankassignment3.credit(200);
		bankassignment3.debit(700);
		bankassignment3.display();
	}	
	
}