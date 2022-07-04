package by.koroza.basics_oop.numbertwo.entity;

public class BankAccount {
	private static int count = 1;

	private int number;
	private double balance;

	public BankAccount() {
		this.number = count++;
		this.balance = 0;
	}

	public BankAccount(double balance) {
		this.number = count++;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void replenishmentBalance(double sum) {
		this.balance += sum;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + number;
		result = result * prime + Double.hashCode(balance);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		BankAccount bankAccount = (BankAccount) object;
		if (number != bankAccount.number) {
			return false;
		}
		if (balance != bankAccount.balance) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() { // TODO toString()
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}

}