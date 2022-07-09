package by.koroza.basics_oop.numbertwo.main.process;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.entity.BankAccount;
import by.koroza.basics_oop.numbertwo.entity.Person;
import by.koroza.basics_oop.numbertwo.entity.Product;
import by.koroza.basics_oop.numbertwo.validation.Validation;

public class Payment {
	private static final String DOES_NOT_MONEY_IN_BANK_ACCOUNT = "you doesn't have enough moneyin your bank account. ";
	private static final String WOULD_YOU_WANT_TOP_UP_YOUR_ACCOUNT = "Would you want to top up your account? Enter Yes - 0, No - 1";
	private static final String DO_YOU_WANT_DELETE_PRODUCT_FROM_RESERVES = "Do you want to delete a product from reserves customer? Yes - 0, No - 1";
	private static final String SPACE = " ";
	private static final String YES = "0";
	private static final String NO = "1";
	private static final String MESSAGE_ERROW = "You entered incorrectly.";
	private static final String MESAGE_ENTER_NUMBER_DELESION_PRODUCT = "Enter the number of the product you want to delete.";

	public static void payment(Person salesman, Person customer) {
		BankAccount[] bankAccountsSalesman = salesman.getBankAccounts();
		BankAccount[] bankAccountsCustomer = customer.getBankAccounts();
		double sumPayment = calculationSumPayment(customer.getProducts());
		checkBalanceCustomer(salesman, customer, sumPayment);
	}

	private static double calculationSumPayment(Product[] products) {
		double sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		return sum;
	}

	private static void checkBalanceCustomer(Person salesman, Person customer, double sumPayment) {
		if (customer.getBankAccounts().length > 1) {

		} else if (customer.getBankAccounts().length == 1) {
			if (customer.getBankAccounts()[0].getBalance() < sumPayment) {
				String answer = enterAnswerOnReplemenishmentBankAccount(customer);
				if (answer.equals(YES)) {
					customer.getBankAccounts()[0]
							.replenishmentBalance(sumPayment - customer.getBankAccounts()[0].getBalance());
					transferringMoney(salesman, customer, sumPayment);
				} else if (answer.equals(NO)) {
					withdrawalReserves(salesman, customer);
				}
			} else {
				transferringMoney(salesman, customer, sumPayment);
			}
		} else if (customer.getBankAccounts().length == 0) {
			withdrawalReserves(salesman, customer);
		}
	}

	private static String enterAnswerOnReplemenishmentBankAccount(Person customer) {
		StringBuilder builder = new StringBuilder();
		builder.append(customer.getLastName()).append(SPACE);
		builder.append(customer.getFirstName()).append(SPACE);
		builder.append(customer.getPatronymic()).append(SPACE);
		builder.append(DOES_NOT_MONEY_IN_BANK_ACCOUNT).append(SPACE).append(WOULD_YOU_WANT_TOP_UP_YOUR_ACCOUNT);
		String answer = enterAnswerYesOrNo(builder);
		return answer;
	}

	private static void withdrawalReserves(Person salesman, Person customer) {
		withdrawalReservesSalesman(salesman);
		withdrawalReservesCustomer(customer);
	}

	private static void withdrawalReservesSalesman(Person salesman) {
		for (Product product : salesman.getProducts()) {
			if (product.getIsStatus() == false) {
				product.setIsStatus(true);
			}
		}
	}

	private static void withdrawalReservesCustomer(Person customer) {
		customer.setProducts(new Product[0]);
	}

	private static void deleteReserveCustomer(Person customer) {
		StringBuilder builder = new StringBuilder();
		builder.append(customer.getLastName()).append(SPACE);
		builder.append(customer.getFirstName()).append(SPACE);
		builder.append(customer.getPatronymic()).append(SPACE);
		builder.append(DO_YOU_WANT_DELETE_PRODUCT_FROM_RESERVES);
		String answer = enterAnswerYesOrNo(builder);
		int number = 0;
		if (answer.equals(YES)) {
			do {
				printProducts(customer);
				number = enterNumberProductToDelete(customer);
				if (number < customer.getProducts().length) {
					customer.deleteProduct(customer.getProducts()[number]);
				}
			} while (number != customer.getProducts().length);

		}
	}

	@SuppressWarnings("resource")
	private static String enterAnswerYesOrNo(StringBuilder builder) {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		System.out.println(builder);
		do {
			answer = scan.nextLine();
		} while (Validation.validationAnswerZeroOrOne(answer) == false);
		return answer;
	}

	private static void printProducts(Person customer) {
		customer.printProducts();
		if (customer.getProducts().length > 0) {
			System.out.println(customer.getProducts().length + " - exit from deletion.");
		}
	}

	private static void transferringMoney(Person salesman, Person customer, double sumPayment) {
		customer.getBankAccounts()[0].setBalance(customer.getBankAccounts()[0].getBalance() - sumPayment);
		salesman.getBankAccounts()[0].setBalance(salesman.getBankAccounts()[0].getBalance() + sumPayment);
	}

	@SuppressWarnings("resource")
	private static int enterNumberProductToDelete(Person customer) {
		StringBuilder builder = new StringBuilder();
		builder.append(customer.getLastName()).append(SPACE);
		builder.append(customer.getFirstName()).append(SPACE);
		builder.append(customer.getPatronymic()).append(SPACE);
		builder.append(MESAGE_ENTER_NUMBER_DELESION_PRODUCT);
		int number = 0;
		do {
			System.out.println(builder);
			Scanner scan = new Scanner(System.in);
			if (scan.hasNextInt()) {
				number = scan.nextInt();
			} else {
				System.out.println(MESSAGE_ERROW);
			}
		} while (Validation.validationEnteredNumberProductForDeletion(number, customer) == false);
		return number;
	}
}