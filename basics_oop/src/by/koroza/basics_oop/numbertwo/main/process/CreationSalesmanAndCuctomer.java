package by.koroza.basics_oop.numbertwo.main.process;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.entity.Person;
import by.koroza.basics_oop.numbertwo.entity.Product;
import by.koroza.basics_oop.numbertwo.validation.Validation;

public class CreationSalesmanAndCuctomer {
	private static final String MESSAGE_ENTER_LAST_NAME = " enter last name (Example: Koroza)";
	private static final String MESSAGE_ENTER_FIRST_NAME = " enter first name (Example: Alexey)";
	private static final String MESSAGE_ENTER_PATRONYMIC = " enter patronymic (Example: Mikhailovich)";
	private static final String MESSAGE_DO_YOU_WANT_ADD_PRODUCT = "do you want to add a product? Enter Yes - 0, No - 1 ";
	private static final String SPACE = " ";
	private static final String CODE_YES = "0";
	private static final String MESSAGE_ENTER_PRODUCT_NAME = "Enter product name.";
	private static final String MESSAGE_ENTER_PRODUCT_PRICE = "Enter product price.";
	private static final String WORD_SALESMAN = "Salesman";
	private static final String WORD_CUSTOMER = "Customer";
	private static final String MESSAGE_ERROW = "You entered incorrectly.";

	public static Person createSalesman() {
		/*
		 * Person salesman = new Person(enterLastName(WORD_SALESMAN),
		 * enterFirstName(WORD_SALESMAN), enterPatronymic(WORD_SALESMAN));
		 */
		Person salesman = new Person("Ko", "Al", "Mi");
		addProduct(salesman);
		return salesman;
	}

	public static Person createCustomer() {
		/*
		 * Person customer = new Person(enterLastName(WORD_CUSTOMER),
		 * enterFirstName(WORD_CUSTOMER), enterPatronymic(WORD_CUSTOMER));
		 */
		Person customer = new Person("Koroza", "Alexey", "Mikhailovich");
		return customer;
	}

	@SuppressWarnings("resource")
	private static String enterLastName(String person) {
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		do {
			System.out.println(person + MESSAGE_ENTER_LAST_NAME);
			lastName = scan.nextLine();
		} while (Validation.validationPersonName(lastName) == false);
		return lastName;
	}

	@SuppressWarnings("resource")
	private static String enterFirstName(String person) {
		Scanner scan = new Scanner(System.in);
		String firstName = "";
		do {
			System.out.println(person + MESSAGE_ENTER_FIRST_NAME);
			firstName = scan.nextLine();
		} while (Validation.validationPersonName(firstName) == false);
		return firstName;
	}

	@SuppressWarnings("resource")
	private static String enterPatronymic(String person) {
		Scanner scan = new Scanner(System.in);
		String patronymic = "";
		do {
			System.out.println(person + MESSAGE_ENTER_PATRONYMIC);
			patronymic = scan.nextLine();
		} while (Validation.validationPersonName(patronymic) == false);
		return patronymic;
	}

	private static void addProduct(Person person) {
		String answer = "";
		do {
			answer = productAdditionConfirmation(person);
			if (answer.equals(CODE_YES)) {
				person.addProduct(createProduct());
			}
		} while (answer.equals(CODE_YES));

	}

	@SuppressWarnings("resource")
	private static String productAdditionConfirmation(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(MESSAGE_DO_YOU_WANT_ADD_PRODUCT);
		Scanner scan = new Scanner(System.in);
		String answer = "";
		System.out.println(builder);
		do {
			answer = scan.nextLine();
		} while (Validation.validationAnswerZeroOrOne(answer) == false);
		return answer;
	}

	private static Product createProduct() {
		Product product = new Product(enterProductName(), enterProductPrice());
		return product;
	}

	@SuppressWarnings("resource")
	private static String enterProductName() {
		Scanner scan = new Scanner(System.in);
		String name = "";
		System.out.println(MESSAGE_ENTER_PRODUCT_NAME);
		do {
			name = scan.nextLine();
		} while (Validation.validationProductName(name) == false);
		return name;
	}

	@SuppressWarnings("resource")
	private static double enterProductPrice() {
		double price = 0;
		boolean isEnterCorrect = false;
		System.out.println(MESSAGE_ENTER_PRODUCT_PRICE);
		do {
			Scanner scan = new Scanner(System.in);
			if (scan.hasNextDouble()) {
				price = scan.nextDouble();
				isEnterCorrect = true;
			} else {
				System.out.println(MESSAGE_ERROW);
			}
		} while (isEnterCorrect == false);
		return price;
	}
}