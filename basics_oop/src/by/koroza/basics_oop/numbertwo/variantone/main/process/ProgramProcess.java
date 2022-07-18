package by.koroza.basics_oop.numbertwo.variantone.main.process;

import by.koroza.basics_oop.numbertwo.variantone.entity.Person;
import by.koroza.basics_oop.numbertwo.variantone.main.process.operations.CreationSalesmanAndCuctomer;
import by.koroza.basics_oop.numbertwo.variantone.main.process.operations.Payment;
import by.koroza.basics_oop.numbertwo.variantone.main.process.operations.SelectionProductsForBuy;

public class ProgramProcess {
	private static final String MESSAGE_LIST_PRODUCT_FOR_BUY = "The list of goods that can be bought";

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

	private static void selectionProductsForBuy(Person salesman, Person customer) {
		SelectionProductsForBuy.selectionProductsForBuy(salesman, customer);
	}
}