package objectsAndClasses;

public class Account {
	
	private int accountNum;
	private double balance;
	
	Account(int accountNum,double balance){
		this.accountNum=accountNum;
		this.balance=balance;
	}
	
	Account(int accountNum){
		this.accountNum=accountNum;
	}

	int getAccountNum() {
		return accountNum;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double balance) {
		this.balance=balance;
	}
	
	void credit(double amount) {
		balance=balance+amount;
		System.out.println(amount+" credited");
	}
	
	void debit(double amount) {
		if(balance<amount) {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		else {
			balance=balance-amount;
			System.out.println(amount+" debited");
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac1=new Account(100002);
		Account ac2=new Account(100012);
		
		ac1.setBalance(2500000);
		ac2.setBalance(300000);
		
		System.out.println("Account details.."+ac1.toString());
		System.out.println("Account details.."+ac2.toString());
		
		ac1.credit(10000);
		ac2.credit(5000);
		
		ac1.debit(2000);
		
		System.out.println("..............................");
		
		System.out.println(ac1.toString());
		System.out.println(ac2.toString());

	}

}
