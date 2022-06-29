package by.koroza.basics_oop.numbertwo.entity;

public class Payment {
	private double sum;
	private BankAccount senderAccount;
	private BankAccount beneficiaryAccount;

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public BankAccount getSenderAccount() {
		return senderAccount;
	}

	public void setSenderAccount(BankAccount senderAccount) {
		this.senderAccount = senderAccount;
	}

	public BankAccount getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(BankAccount beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(sum);
		result = result * prime + (senderAccount != null ? senderAccount.hashCode() : 1);
		result = result * prime + (beneficiaryAccount != null ? beneficiaryAccount.hashCode() : 1);
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
		Payment payment = (Payment) object;
		if (sum != payment.sum) {
			return false;
		}
		if (senderAccount == null) {
			if (payment.senderAccount != null) {
				return false;
			}
		} else if (!senderAccount.equals(payment.senderAccount)) {
			return false;
		}
		if (beneficiaryAccount == null) {
			if (payment.beneficiaryAccount != null) {
				return false;
			}
		} else if (!beneficiaryAccount.equals(payment.beneficiaryAccount)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() { //TODO toString()
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}
}