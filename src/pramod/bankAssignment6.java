package pramod;
class bankAssignment6
{
	int balance = 1000;
	void debitAmt(int n)
	{
		if(n > balance)
		{
			System.out.println("Insufficient Balance");
		} else if(n<0)
		{
			System.out.println("Invalid amount");
		}else
		{
		    balance = balance - n;
			System.out.println("User debited :" + balance);
		}
	}
	void creditAmt(int n)
	{
		if(n > 5000)
		{
			System.out.println("You can deposit more than 5000 rs in one go");
		}else if(n<0)
		{
			System.out.println("Invalid Amount");
		}else
		{
			balance= balance + n;
			System.out.println("User credited :" + balance);
		}
	}
	
	public static void main(String args[])
	{
		bankAssignment6 bankassignment6 = new bankAssignment6();
		bankassignment6.debitAmt(2000);
		bankassignment6.debitAmt(-6);
		bankassignment6.debitAmt(300);
		bankassignment6.creditAmt(6000);
		bankassignment6.creditAmt(-600);
		bankassignment6.creditAmt(4000);
	}
	
}