package account;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account("441-0290-1203", 500000, 7.3);

		System.out.printf("계좌정보: %s 현재잔액: %d\n", a.getAccount(), a.getBalance());
		a.withdraw(600000);
		a.deposit(20000);
		System.out.printf("계좌정보: %s 현재잔액: %d\n", a.getAccount(), a.getBalance());
		System.out.println("이자: " + a.calculateInterest());
	}

}
