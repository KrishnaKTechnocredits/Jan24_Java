package rohini_deshmane;

class Bank {
    int balance = 1000;

    void debitAmount(int amt){
        balance = balance-amt;
    }

    void creditAmount(int amt){
        balance = balance+amt;
    }
    
    void printBalance() {
        System.out.println("\n\n Total balance = "+balance+"\n\n");
    }
    
    public static void main(String args[]) {
        Bank bank = new Bank();
        bank.debitAmount(200);
        bank.creditAmount(500);
        bank.creditAmount(200);
        bank.debitAmount(700);
        bank.printBalance();
    }
}