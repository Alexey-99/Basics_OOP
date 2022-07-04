package by.koroza.basics_oop.numbertwo.main.process;

import by.koroza.basics_oop.numbertwo.entity.Person;

public class ProgramProcess {

	public static void programProcess() {
		Person salesman = createSalesman();
		Person customer = createCustomer();
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
		
	}
}