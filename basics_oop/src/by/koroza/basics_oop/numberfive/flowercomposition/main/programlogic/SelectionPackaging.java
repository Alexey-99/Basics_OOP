package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.Scanner;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;
import by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging.Packaging;
import by.koroza.basics_oop.numberfive.flowercomposition.validation.Validation;

import static by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase.getPackagings;

public class SelectionPackaging {
	private static final String MESSAGE_WANT_CHOOSE_PACKAGING = "Would you like to choose a packaging?";
	private static final String MESSAGE_ENTER_NUMBER_PACKAGING = "If you need packaging for a bouquet, enter the packaging number, if not, enter - ";

	public static Packaging selectionFlowers() {
		Packaging packaging = null;
		System.out.println(MESSAGE_WANT_CHOOSE_PACKAGING);
		DataBase.printPackagingTypes();
		int numberPackaging = enterNumberPackaging();
		if (numberPackaging < getPackagings().size()) {
			packaging = getPackagings().get(numberPackaging);
		}
		return packaging;
	}

	private static int enterNumberPackaging() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numberPackaging = 0;
		String number = "";
		do {
			System.out.println(MESSAGE_ENTER_NUMBER_PACKAGING + getPackagings().size());
			number = scan.nextLine();
		} while (Validation.validationEnterNumberPackaging(number) == false);
		numberPackaging = parseInt(number);
		return numberPackaging;
	}

	private static int parseInt(String number) {
		int numberFlower = Integer.parseInt(number);
		return numberFlower;
	}
}