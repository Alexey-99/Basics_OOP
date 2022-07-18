package by.koroza.basics_oop.numbertwo.variantone.validation;

import java.util.regex.Pattern;

import by.koroza.basics_oop.numbertwo.variantone.entity.Person;

public class Validation {
	private static final String REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC = "[A-Z]{1}[a-z]+";
	private static final String REG_EXR_FOR_ANSWER_ZERO_OR_ONE = "[0|1]{1}";
	private static final String REG_EXR_FOR_PRODUCT_NAME = "[A-z]+";
	private static final String MESSAGE_ERROW = "You entered incorrectly.";
	private static final String MESSAGE_PRODUCT_RESERVED = "This product reserved.";
	private static final int OPERATION_EXIT = 1;

	public static boolean validationPersonName(String name) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC, name);
		if (isCorrect == false) {
			System.out.println(MESSAGE_ERROW);
		}
		return isCorrect;
	}

	public static boolean validationAnswerZeroOrOne(String answer) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_ANSWER_ZERO_OR_ONE, answer);
		if (isCorrect == false) {
			System.out.println(MESSAGE_ERROW);
		}
		return isCorrect;
	}

	public static boolean validationProductName(String name) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_PRODUCT_NAME, name);
		if (isCorrect == false) {
			System.out.println(MESSAGE_ERROW);
		}
		return isCorrect;
	}

	public static boolean validationEnteredNumberForBuy(int number, Person salesman) {
		boolean isCorrect = true;
		if (number >= salesman.getProducts().length + OPERATION_EXIT) {
			isCorrect = false;
		}
		if (isCorrect == false) {
			System.out.println(MESSAGE_ERROW);
		}
		if ((isCorrect == true) && (number < salesman.getProducts().length)) {
			isCorrect = checkStatusProduct(number, salesman);
		}
		return isCorrect;
	}

	public static boolean validationEnteredNumberProductForDeletion(int number, Person custoner) {
		boolean isCorrect = false;
		if (number < custoner.getProducts().length + OPERATION_EXIT) {
			isCorrect = true;
		}
		return isCorrect;
	}

	private static boolean checkStatusProduct(int number, Person salesman) {
		boolean isCorrect = salesman.getProducts()[number].getIsStatus();
		if (isCorrect == false) {
			System.out.println(MESSAGE_PRODUCT_RESERVED);
		}
		return isCorrect;
	}
}