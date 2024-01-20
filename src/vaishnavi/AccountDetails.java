package vaishnavi;

class AccountDetails{

	int balance = 1000;

	void debitAmount(int amount){
		balance = balance - amount;
	}

	void creditAmount(int amount){
		balance = balance + amount;
	}

	void printBalance(){
		System.out.println("Balance : " + balance);
	}

	public static void main(String[] args){
		AccountDetails accountDetail = new AccountDetails();
		accountDetail.debitAmount(200);
		accountDetail.creditAmount(500);
		accountDetail.creditAmount(200);
		accountDetail.debitAmount(700);
		accountDetail.printBalance();
	}
}
