package by.koroza.basics_oop.numbertwo.main.process;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.entity.BankAccount;
import by.koroza.basics_oop.numbertwo.entity.Person;
import by.koroza.basics_oop.numbertwo.entity.Product;
import by.koroza.basics_oop.numbertwo.validation.Validation;

public class Payment {
	private static final String DOES_NOT_MONEY_IN_BANK_ACCOUNT = "you doesn't have enough moneyin your bank account. ";
	private static final String WOULD_YOU_WANT_TOP_UP_YOUR_ACCOUNT = "Would you want to top up your account? Enter Yes - 0, No - 1";
	private static final String SPACE = " ";
	private static final String YES = "0";
	private static final String NO = "1";

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

				} else if (answer.equals(NO)) { // Do you want to delete a product from array customer?
					//withdrawalReserves(salesman, customer);
				}
			}
		} else if (customer.getBankAccounts().length == 0) {
			withdrawalReserves(salesman, customer);
		}
	}

	@SuppressWarnings("resource")
	private static String enterAnswerOnReplemenishmentBankAccount(Person customer) {
		StringBuilder builder = new StringBuilder();
		builder.append(customer.getLastName()).append(SPACE);
		builder.append(customer.getFirstName()).append(SPACE);
		builder.append(customer.getPatronymic()).append(SPACE);
		builder.append(DOES_NOT_MONEY_IN_BANK_ACCOUNT).append(SPACE).append(WOULD_YOU_WANT_TOP_UP_YOUR_ACCOUNT);
		Scanner scan = new Scanner(System.in);
		String answer = "";
		System.out.println(builder);
		do {
			answer = scan.nextLine();
		} while (Validation.validationAnswerZeroOrOne(answer) == false);
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
}