public class BankAccount {

	private String holder;
	private double balance;

	public BankAccount(String holder, double balance) {
		this.holder = holder;
		initializeBalance(balance);
	}

	public double deposit(double amount) {
		if (!valueValidate(amount)) {
			return this.balance;
		}

		return this.balance += amount;
	}

	public double withdraw(double amount) {
		if (!valueValidate(amount)) {
			return this.balance;
		}

		if (amount > this.balance) {
			System.out.println("Saldo insuficiente");
			return this.balance;
		}

		this.balance -= amount;

		System.out.println(getBalance());
		return this.balance;
	}

	
	private void initializeBalance(double balance) {
		if (balance < 0) {
			System.out.println("O saldo não pode ser negativo");
			return;
		}

		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getHolder() {
		return this.holder;
	}

	private boolean valueValidate(double amount) {
		if (amount <= 0) {
			System.out.println("Valor deve ser maior que zero");
			return false;
		}
		return true;
	}
}
