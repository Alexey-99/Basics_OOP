package by.koroza.basics_oop.numberone.variantone.validation;

import java.util.regex.Pattern;

import by.koroza.basics_oop.numberone.variantone.entitiy.TextFile;

public class Validation {
	private static final String REG_EX_VALID_FOR_DIGITS = "\\d+";

	public static boolean validationEnteredNumberFile(String number, TextFile[] files) {
		boolean isCorrect = validationForDigit(number);
		if (isCorrect == true) {
			int numberFile = parseNumber(number);
			isCorrect = validationForHavingNumberFile(numberFile, files);
		}
		return isCorrect;
	}

	private static boolean validationForDigit(String number) {
		boolean isCorrect = Pattern.matches(REG_EX_VALID_FOR_DIGITS, number);
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