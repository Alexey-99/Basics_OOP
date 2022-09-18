package by.koroza.basics_oop.numberfive.flowercomposition.validation;

import java.util.regex.Pattern;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;

public class Validation {
	private static final String REG_EX_NUMBER_FLOWER = "\\d+";
	private static final String REG_EX_ANSWER_COMPLETE_BOUGUET = "[0|1]";
	private static final String MESSAGE_YOU_ENTERED_NUMBER_FLOWER_INCORRECTLY = "You entered number flower incorrectly.";
	private static final String MESSAGE_YOU_ENTERED_QUANTITY_INCORRECTLY = "You entered quantity flowers incorrectly.";
	private static final String MESSAGE_YOU_ENTERED_ANSWER_INCORRECTLY = "You entered the answer incorrectly.";

	private static final String MESSAGE_YOU_ENTERED_NUMBER_PACKAGING_INCORRECTLY = "You entered number packaging incorrectly.";

	public static boolean validationEnterNumberFlower(String number) {
		boolean isCorrect = validationOnDigit(number);
		if (isCorrect == true) {
			int numberFlower = parseInt(number);
			if (numberFlower > DataBase.getFlowers().size()) {
				isCorrect = false;
			}
		}
		if (isCorrect == false) {
			System.out.println(MESSAGE_YOU_ENTERED_NUMBER_FLOWER_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationEnterQuantityFlowers(String quantity) {
		boolean isCorrect = validationOnDigit(quantity);
		if (isCorrect == false) {
			System.out.println(MESSAGE_YOU_ENTERED_QUANTITY_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationEnterAnswerYesOrNo(String answer) {
		boolean isCorrect = Pattern.matches(REG_EX_ANSWER_COMPLETE_BOUGUET, answer);
		if (isCorrect == false) {
			System.out.println(MESSAGE_YOU_ENTERED_ANSWER_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationEnterNumberPackaging(String number) {
		boolean isCorrect = validationOnDigit(number);
		if (isCorrect == true) {
			int numberPackaging = parseInt(number);
			if (numberPackaging > DataBase.getPackagings().size()) {
				isCorrect = false;
			}
		}
		if (isCorrect == false) {
			System.out.println(MESSAGE_YOU_ENTERED_NUMBER_PACKAGING_INCORRECTLY);
		}
		return isCorrect;
	}

	private static int parseInt(String number) {
		int numberFlower = Integer.parseInt(number);
		return numberFlower;
	}

	private static boolean validationOnDigit(String number) {
		boolean isCorrect = Pattern.matches(REG_EX_NUMBER_FLOWER, number);
		return isCorrect;
	}
}