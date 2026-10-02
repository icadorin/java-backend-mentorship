public class Main {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Israel", -200.0);

		bankAccount.deposit(50.0);
		bankAccount.withdraw(2);
		bankAccount.getBalance();
	}
}
