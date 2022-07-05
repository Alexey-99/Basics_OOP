package by.koroza.basics_oop.numbertwo.validation;

import java.util.regex.Pattern;

import by.koroza.basics_oop.numbertwo.entity.Person;

public class Validation {
	private static final String REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC = "[A-Z]{1}[a-z]+";
	private static final String REG_EXR_FOR_ANSWER_ZERO_OR_ONE = "[0|1]{1}";
	private static final String REG_EXR_FOR_PRODUCT_NAME = "[A-z]+";
	private static final String REG_EXR_FOR_PRODUCT_PRICE = "(\\d+\\.\\d+)|(\\d+)";
	private static final String REG_EXR_ON_DIGITS = "\\d+";
	private static final String YOU_ENTERED_INCORRECTLY = "You entered incorrectly.";
	private static final String PRODUCT_RESERVED = "This product reserved.";
	private static final int OPERATION_EXIT = 1;

	public static boolean validationPersonName(String name) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC, name);
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationAnswerZeroOrOne(String answer) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_ANSWER_ZERO_OR_ONE, answer);
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationProductName(String name) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_PRODUCT_NAME, name);
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationProductPrice(String name) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_PRODUCT_PRICE, name);
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationEnteredNumberForBuy(String number, Person salesman) {
		int numberInt = 0;
		boolean isCorrect = Pattern.matches(REG_EXR_ON_DIGITS, number);
		if (isCorrect == true) {
			numberInt = Integer.parseInt(number);
			if (numberInt >= salesman.getProducts().length + OPERATION_EXIT) {
				isCorrect = false;
			}
		}
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		if (isCorrect == true) {
			isCorrect = checkStatusProduct(numberInt, salesman);
		}
		return isCorrect;
	}

	private static boolean checkStatusProduct(int numberInt, Person salesman) {
		boolean isCorrect = salesman.getProducts()[numberInt].getIsStatus();
		if (isCorrect == false) {
			System.out.println(PRODUCT_RESERVED);
		}
		return isCorrect;
	}
}