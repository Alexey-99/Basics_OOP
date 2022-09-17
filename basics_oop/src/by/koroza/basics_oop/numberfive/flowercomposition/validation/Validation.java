package by.koroza.basics_oop.numberfive.flowercomposition.validation;

import java.util.regex.Pattern;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;

public class Validation {
	private static final String REG_EX_NUMBER_FLOWER = "\\d+";
	private static final String MESSAGE_YOU_ENTERED_NUMBER_INCORRECTLY = "You entered number flower inCorrectly";

	public static boolean validationEnterNumberFlower(String number) {
		boolean isCorrect = validationOnDigit(number);
		if (isCorrect == true) {
			int numberFlower = parseInt(number);
			if (numberFlower > DataBase.getFlowerNames().size()) {
				isCorrect = false;
			}
		}
		if (isCorrect == false) {
			System.out.println(MESSAGE_YOU_ENTERED_NUMBER_INCORRECTLY);
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
