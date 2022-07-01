package by.koroza.basics_oop.numbertwo.process;

import java.util.Scanner;

import by.koroza.basics_oop.numbertwo.entity.Person;
import by.koroza.basics_oop.numbertwo.entity.Product;
import by.koroza.basics_oop.numbertwo.validation.Validation;

public class ProgramProcess {
	private static final String ENTER_LAST_NAME = "Enter last name (Example: Koroza)";
	private static final String ENTER_FIRST_NAME = "Enter first name (Example: Alexey)";
	private static final String ENTER_PATRONYMIC = "Enter patronymic (Example: Mikhailovich)";

	private static final String DO_YOU_WANT_ADD_PRODUCT = " do you want to add a product? Enter Yes - 0, No - 1 ";

	public static void programProcess() {
		Person solder = createSolder();
		Person costomer = createCostomer();
	}

	private static Person createSolder() {
		Person solder = new Person(enterLastName(), enterFirstName(), enterPatronymic());
		addProduct(solder);
		// solder.addProduct(new Product("A", 5.99));
		return solder;
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
		Scanner scan = new Scanner(System.in);
		String answer = "";
		System.out.println(DO_YOU_WANT_ADD_PRODUCT);
		do {
			answer = scan.nextLine();
		} while (Validation.validationAnswerZeroOrOne(answer) == false);
	}
}