public class Main {
	public static void main(String[] args) {
		BankAccount accountOne = new BankAccount("123", "Israel", 100.0);
		BankAccount accountTwo = new BankAccount("1234", "Delson");

		accountOne.depositAll(50.0);
		System.out.println(accountOne.balance);
		System.out.println(accountTwo.holder);
	}
}

public class BankAccount {

	String accountNumber;
	String holder;
	double balance;

	public BankAccount() {}

	public BankAccount(String accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public BankAccount(String accountNumber, String holder, double initialBalance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = initialBalance;
	}

	public void depositAll(double amount) {
		this.balance += amount;
	}
}