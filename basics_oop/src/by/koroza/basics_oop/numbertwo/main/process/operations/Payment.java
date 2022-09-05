package by.koroza.basics_oop.numbertwo.main.process.operations;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.entity.Person;
import by.koroza.basics_oop.numbertwo.entity.Product;
import by.koroza.basics_oop.numbertwo.validation.Validation;

public class Payment {
	private static final String MASSEGE_DOES_NOT_MONEY_IN_BANK_ACCOUNT = "you doesn't have enough moneyin your bank account. ";
	private static final String MASSEGE_WOULD_YOU_WANT_TOP_UP_YOUR_ACCOUNT = "Would you want to top up your account? Enter Yes - 0, No - 1";
	private static final String MASSEGE_BALANCE_BANK_ACCOUNT_REPLENISHED = "bank account balance has been replenished.";
	private static final String MASSEGE_BANK_ACCOUNT_BALANCE_NOW = "bank account balance is now";
	private static final String MASSEGE_TRANSFER_MONEY_COMPLETED = "Transfer money successfully completed.";
	private static final String SPACE = " ";
	private static final String CODE_YES = "0";
	private static final String CODE_NO = "1";
	private static final String NEXT_LINE = "\n";

	public static void payment(Person salesman, Person customer) {
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
		if (customer.getBankAccount().getBalance() < sumPayment) {
			String answer = enterAnswerOnReplemenishmentBankAccount(customer);
			if (answer.equals(CODE_YES)) {
				replenishmentBalance(customer, sumPayment);
				transferringMoney(salesman, customer, sumPayment);
			} else if (answer.equals(CODE_NO)) {
				withdrawalReserves(salesman, customer);
			}
		} else {
			transferringMoney(salesman, customer, sumPayment);
		}
	}

	private static String enterAnswerOnReplemenishmentBankAccount(Person customer) {
		StringBuilder builder = new StringBuilder();
		builder.append(customer.lastFirstNamePatronymic()).append(SPACE);
		builder.append(MASSEGE_DOES_NOT_MONEY_IN_BANK_ACCOUNT).append(SPACE)
				.append(MASSEGE_WOULD_YOU_WANT_TOP_UP_YOUR_ACCOUNT);
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

	private static void replenishmentBalance(Person customer, double sumPayment) {
		customer.getBankAccount().replenishmentBalance(sumPayment - customer.getBankAccount().getBalance());
		StringBuilder builder = new StringBuilder();
		builder.append(customer.lastFirstNamePatronymic()).append(SPACE)
				.append(MASSEGE_BALANCE_BANK_ACCOUNT_REPLENISHED).append(NEXT_LINE);
		builder.append(customer.lastFirstNamePatronymic()).append(MASSEGE_BANK_ACCOUNT_BALANCE_NOW).append(SPACE)
				.append(customer.getBankAccount().getBalance());
		System.out.println(builder);
	}

	private static void transferringMoney(Person salesman, Person customer, double sumPayment) {
		customer.getBankAccount().setBalance(customer.getBankAccount().getBalance() - sumPayment);
		salesman.getBankAccount().setBalance(salesman.getBankAccount().getBalance() + sumPayment);
		StringBuilder builder = new StringBuilder();
		builder.append(MASSEGE_TRANSFER_MONEY_COMPLETED).append(NEXT_LINE);
		builder.append(customer.lastFirstNamePatronymic()).append(MASSEGE_BANK_ACCOUNT_BALANCE_NOW).append(SPACE)
				.append(customer.getBankAccount().getBalance()).append(NEXT_LINE);
		builder.append(salesman.lastFirstNamePatronymic()).append(MASSEGE_BANK_ACCOUNT_BALANCE_NOW).append(SPACE)
				.append(salesman.getBankAccount().getBalance());
		System.out.println(builder);
	}
}