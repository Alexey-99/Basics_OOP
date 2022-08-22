package by.koroza.basics_oop.numberfour.validation;

import java.util.regex.Pattern;

public class Validation {
	private static final String REG_EX_VALID_NUMBER_MAIN_OPERATION = "[0|1]|2|3|4]";

	public static boolean enterNumberOperation(String number) {
		boolean isCorrect = Pattern.matches(number, REG_EX_VALID_NUMBER_MAIN_OPERATION);
		if(isCorrect == false) {
			
		}
		return isCorrect;
	}
}