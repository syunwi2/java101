package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double calculateInterest() {
		double interest = this.balance * (this.interestRate / 100);
				
		return interest;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		if (this.balance - money < 0) {
			System.out.println("출금 할 수 없습니다.");
			return;
		}
		this.balance -= money;
	}
}
