package by.koroza.basics_oop.numberone.validation;

import java.util.regex.Pattern;

import by.koroza.basics_oop.numberone.entities.TextFile;

public class Validation {

	public static boolean validationEnteredNumberFile(String number, TextFile[] files) {
		boolean isCorrect = validationForDigit(number);
		if (isCorrect == true) {
			int numberFile = parseNumber(number);
			isCorrect = validationForHavingNumberFile(numberFile, files);
		}
		return isCorrect;
	}

	private static boolean validationForDigit(String number) {
		boolean isCorrect = Pattern.matches("\\d+", number);
		return isCorrect;
	}

	private static boolean validationForHavingNumberFile(int number, TextFile[] files) {
		boolean isCorrect = false;
		if (number < files.length) {
			isCorrect = true;
		}
		return isCorrect;
	}

	private static int parseNumber(String number) {
		int numberInt = Integer.parseInt(number);
		return numberInt;
	}
}