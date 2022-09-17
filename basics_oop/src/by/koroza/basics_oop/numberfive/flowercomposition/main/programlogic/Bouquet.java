package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;
import by.koroza.basics_oop.numberfive.flowercomposition.validation.Validation;

public class Bouquet {
	private static List<Object> flowers = new ArrayList<>();
	private static final String MESSAGE_CHOOSE_FLOWER = "Good afternoon! Choose the flowers you want in the bouquet.";
	private static final String MESSAGE_ENTER_NUMBER_FLOWER = "Enter the number of the flower you want in the bouquet or if you want to exit enter - ";

	public static List<Object> getFlowers() {
		return flowers;
	}

	public static void setFlowers(List<Object> flowers) {
		Bouquet.flowers = flowers;
	}

	public static void selectionFlowers() {
		boolean isFlagWhile = true;
		System.out.println(MESSAGE_CHOOSE_FLOWER);
		while (isFlagWhile) {
			DataBase.printFlowerNames();
			int number = enterNumberFlower();
			if (number < DataBase.getFlowerNames().size()) {

			} else if (number == DataBase.getFlowerNames().size()) {
				isFlagWhile = false;
			}
		}
	}

	private static int enterNumberFlower() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numberFlower = 0;
		String number = "";
		do {
			System.out.println(MESSAGE_ENTER_NUMBER_FLOWER + DataBase.getFlowerNames().size());
			number = scan.nextLine();
		} while (Validation.validationEnterNumberFlower(number) == false);
		numberFlower = Integer.parseInt(number);
		return numberFlower;
	}

	private static void addFlower(int number) {
		switch(number) {
		case 0:
			
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5: 
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		}
	}
}