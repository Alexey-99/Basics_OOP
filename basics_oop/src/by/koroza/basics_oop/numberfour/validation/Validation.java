package by.koroza.basics_oop.numberfour.validation;

import java.util.regex.Pattern;

public class Validation {
	private static final String REG_EX_VALID_NUMBER_MAIN_OPERATION = "[0|1|2|3|4]";
	private static final String REG_EX_VALID_PRICE_TREASURE = "\\d+";
	private static final String MESSAGE_ENTER_NUMBER_INCORRECTLY = "You entered operation number incorrectly.";
	private static final String MESSAGE_ENTER_PRICE_INCORRECTLY = "You entered price incorrectly.";

	public static boolean enterNumberOperation(String number) {
		boolean isCorrect = Pattern.matches(REG_EX_VALID_NUMBER_MAIN_OPERATION, number);
		if (isCorrect == false) {
			System.out.println(MESSAGE_ENTER_NUMBER_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean enterPriceTreasure(String price) {
		boolean isCorrect = Pattern.matches(REG_EX_VALID_PRICE_TREASURE, price);
		if (isCorrect == false) {
			System.out.println(MESSAGE_ENTER_PRICE_INCORRECTLY);
		}
		return isCorrect;
	}
}