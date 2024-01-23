package sarang_kulkarni;

class AccountBalance {
	int balance = 1000;
	void debitamt(int amt){
		balance = balance - amt;
		}
	void creditamt(int amt){
		balance = balance + amt;
	}
	
	void totalbalance(){
		System.out.println(+ balance);
	}

	public static void main(String[] args){
		AccountBalance accountbalance = new AccountBalance();
		accountbalance.debitamt(300);
		accountbalance.totalbalance();
	}
}