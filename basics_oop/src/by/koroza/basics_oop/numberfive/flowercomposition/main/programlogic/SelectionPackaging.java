package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.Scanner;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;
import by.koroza.basics_oop.numberfive.flowercomposition.validation.Validation;

public class SelectionPackaging {
	private static final String MESSAGE_WANT_CHOOSE_PACKAGING = "Would you like to choose a packaging?";
	private static final String MESSAGE_ENTER_NUMBER_PACKAGING = "If you need packaging for a bouquet, enter the packaging number, if not, enter - ";

	public static void selectionFlowers() {
		boolean isFlagWhile = true;
		System.out.println(MESSAGE_WANT_CHOOSE_PACKAGING);
		while (isFlagWhile == true) {
			DataBase.printPackagingTypes();
			int numberPackaging = enterNumberPackaging();

			if (numberFlower < DataBase.getFlowers().size()) {
				int quantity = enterQuantityFlowers();
				addFlower(numberFlower, quantity);
				// print();
				String answer = enterAnswerOnCompleteBouguet();
				if (answer.equals(CODE_ANSWER_NO)) {
					isFlagWhile = false;
				}
			} else if (numberFlower == DataBase.getFlowers().size()) {
				isFlagWhile = false;
			}
		}
	}

	private static int enterNumberPackaging() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numberPackaging = 0;
		String number = "";
		do {
			System.out.println(MESSAGE_ENTER_NUMBER_PACKAGING + DataBase.getPackagings().size());
			number = scan.nextLine();
		} while (Validation.validationEnterNumberFlower(number) == false);
		
		numberPackaging = parseInt(number);
		return numberPackaging;
	}

}