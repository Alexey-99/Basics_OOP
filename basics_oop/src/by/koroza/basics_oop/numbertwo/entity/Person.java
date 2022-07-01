package by.koroza.basics_oop.numbertwo.entity;

public class Person {
	private static int count = 1;

	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private BankAccount[] bankAccounts;
	private Product[] products;

	public Person(String lastName, String firstName, String patronymic) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.bankAccounts = new BankAccount[1];
		this.bankAccounts[0] = new BankAccount();
		this.products = new Product[0];
	}

	public Person(String lastName, String firstName, String patronymic, Product[] products) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.bankAccounts = new BankAccount[1];
		this.bankAccounts[0] = new BankAccount();
		this.products = products;
	}

	public Person(String lastName, String firstName, String patronymic, Product product) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.bankAccounts = new BankAccount[1];
		this.bankAccounts[0] = new BankAccount();
		this.products = new Product[1];
		this.products[0] = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(BankAccount[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public void addBankAccount() {
		BankAccount[] newBankAccounts = new BankAccount[this.bankAccounts.length + 1];
		for (int i = 0; i < newBankAccounts.length; i++) {
			if (i < this.bankAccounts.length) {
				newBankAccounts[i] = this.bankAccounts[i];
			} else if (i == this.bankAccounts.length) {
				newBankAccounts[i] = this.bankAccounts[i];
			}
		}
		this.bankAccounts = newBankAccounts;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (lastName != null ? lastName.hashCode() : 1);
		result = result * prime + (firstName != null ? firstName.hashCode() : 1);
		result = result * prime + (patronymic != null ? patronymic.hashCode() : 1);
		result = result * prime + (bankAccounts != null ? bankAccounts.hashCode() : 1);
		result = result * prime + (products != null ? products.hashCode() : 1);
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
		Person person = (Person) object;
		if (id != person.id) {
			return false;
		}
		if (lastName == null) {
			if (person.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(person.lastName)) {
			return false;
		}
		if (firstName == null) {
			if (person.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(person.firstName)) {
			return false;
		}
		if (patronymic == null) {
			if (person.patronymic != null) {
				return false;
			}
		} else if (!patronymic.equals(person.patronymic)) {
			return false;
		}
		if (bankAccounts == null) {
			if (person.bankAccounts != null) {
				return false;
			}
		} else if (!bankAccounts.equals(person.bankAccounts)) {
			return false;
		}
		if (products == null) {
			if (person.products != null) {
				return false;
			}
		} else if (!products.equals(person.products)) {
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