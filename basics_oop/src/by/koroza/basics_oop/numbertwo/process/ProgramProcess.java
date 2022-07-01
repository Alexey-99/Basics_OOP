package by.koroza.basics_oop.numbertwo.process;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.entity.Person;
import by.koroza.basics_oop.numbertwo.entity.Product;
import by.koroza.basics_oop.numbertwo.validation.Validation;

public class ProgramProcess {
	private static final String ENTER_LAST_NAME = "Enter last name (Example: Koroza)";
	private static final String ENTER_FIRST_NAME = "Enter first name (Example: Alexey)";
	private static final String ENTER_PATRONYMIC = "Enter patronymic (Example: Mikhailovich)";
	private static final String DO_YOU_WANT_ADD_PRODUCT = "do you want to add a product? Enter Yes - 0, No - 1 ";
	private static final String SPACE = " ";
	private static final String YES = "0";
	private static final String ENTER_PRODUCT_NAME = "Enter product name.";

	public static void programProcess() {
		Person salesman = createSalesman();
		Person costomer = createCostomer();
	}

	private static Person createSalesman() {
		Person salesman = new Person(enterLastName(), enterFirstName(), enterPatronymic());
		addProduct(salesman);
		return salesman;
	}

	private static Person createCostomer() {
		Person costomer = new Person(enterLastName(), enterFirstName(), enterPatronymic());
		return costomer;
	}

	@SuppressWarnings("resource")
	private static String enterLastName() {
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		do {
			System.out.println(ENTER_LAST_NAME);
			lastName = scan.nextLine();
		} while (Validation.validationPersonName(lastName) == false);
		return lastName;
	}

	@SuppressWarnings("resource")
	private static String enterFirstName() {
		Scanner scan = new Scanner(System.in);
		String firstName = "";
		do {
			System.out.println(ENTER_FIRST_NAME);
			firstName = scan.nextLine();
		} while (Validation.validationPersonName(firstName) == false);
		return firstName;
	}

	@SuppressWarnings("resource")
	private static String enterPatronymic() {
		Scanner scan = new Scanner(System.in);
		String patronymic = "";
		do {
			System.out.println(ENTER_PATRONYMIC);
			patronymic = scan.nextLine();
		} while (Validation.validationPersonName(patronymic) == false);
		return patronymic;
	}

	private static void addProduct(Person person) {
		String answer = "";
		do {
			answer = productAdditionConfirmation(person);
			if (answer.equals(YES)) {
				person.addProduct(createProduct());
			}
		} while (answer.equals(YES));

	}

	@SuppressWarnings("resource")
	private static String productAdditionConfirmation(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(DO_YOU_WANT_ADD_PRODUCT);
		Scanner scan = new Scanner(System.in);
		String answer = "";
		System.out.println(builder);
		do {
			answer = scan.nextLine();
		} while (Validation.validationAnswerZeroOrOne(answer) == false);
		return answer;
	}

	private static Product createProduct() {
		Product product = new Product(enterProductName(), 1.5);
		return product;
	}
	
	@SuppressWarnings("resource")
	private static String enterProductName() {
		Scanner scan = new Scanner(System.in);
		String name = "";
		do {
			System.out.println(ENTER_PRODUCT_NAME);
			name = scan.nextLine();
		} while (Validation.validationPersonName(name) == false);
		return name;
	}
}