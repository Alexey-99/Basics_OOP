package by.koroza.basics_oop.numbertwo.variantone.main.process;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.variantone.entity.Person;
import by.koroza.basics_oop.numbertwo.variantone.validation.Validation;

public class ProgramProcess {
	private static final String MASSEGE_ENTER_PRODUCT_NUMBER = "enter the product number you want to buy.";
	private static final String SPACE = " ";
	private static final String OPERATION_EXIT = " - exit";
	private static final String MESSAGE_ERROW = "You entered incorrectly.";
	private static final String MESSAGE_LIST_PRODUCT_FOR_BUY = "The list of goods that can be bought";
	private static final boolean STATUS_RESERVED = false;

	public static void programProcess() {
		Person salesman = createSalesman();
		Person customer = createCustomer();
		System.out.println(MESSAGE_LIST_PRODUCT_FOR_BUY);
		selectionProductsForBuy(salesman, customer);
		Payment.payment(salesman, customer);
	}

	private static Person createSalesman() {
		Person salesman = CreationSalesmanAndCuctomer.createSalesman();
		return salesman;
	}

	private static Person createCustomer() {
		Person costomer = CreationSalesmanAndCuctomer.createCustomer();
		return costomer;
	}

	private static void printProductsSalesman(Person salesman) {
		salesman.printProducts();
		System.out.println(salesman.getProducts().length + OPERATION_EXIT);
	}

	@SuppressWarnings("resource")
	private static int enterNumberProductForBuy(Person salesman, Person customer) {
		int number = 0;
		StringBuilder builder = new StringBuilder();
		builder.append(customer.lastFirstNamePatronymic()).append(SPACE);
		builder.append(MASSEGE_ENTER_PRODUCT_NUMBER);
		System.out.println(builder);
		do {
			Scanner scan = new Scanner(System.in);
			if (scan.hasNextInt()) {
				number = scan.nextInt();
			} else {
				System.out.println(MESSAGE_ERROW);
			}
		} while (Validation.validationEnteredNumberForBuy(number, salesman) == false);
		return number;
	}

	private static void selectionProductsForBuy(Person salesman, Person customer) {
		int numberProduct = 0;
		do {
			printProductsSalesman(salesman);
			numberProduct = enterNumberProductForBuy(salesman, customer);
			if (numberProduct < salesman.getProducts().length) {
				customer.addProduct(salesman.getProducts()[numberProduct]);
				salesman.getProducts()[numberProduct].setIsStatus(STATUS_RESERVED);
			}
		} while (numberProduct < salesman.getProducts().length);
	}
}