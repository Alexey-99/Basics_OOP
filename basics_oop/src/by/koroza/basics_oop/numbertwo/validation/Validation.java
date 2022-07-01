package by.koroza.basics_oop.numbertwo.validation;

import java.util.regex.Pattern;

public class Validation {
	private static final String REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC = "[A-Z]{1}[a-z]+";
	private static final String YOU_ENTERED_INCORRECTLY = "You entered incorrectly.";

	public static boolean validationPersonName(String name) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC, name);
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		return isCorrect;
	}
}
