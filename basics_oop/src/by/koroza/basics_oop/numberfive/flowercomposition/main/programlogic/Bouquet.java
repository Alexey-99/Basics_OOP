package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;
import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;
import by.koroza.basics_oop.numberfive.flowercomposition.validation.Validation;

public class Bouquet {
	private static List<Flower> flowers = new ArrayList<>();
	private static final String MESSAGE_CHOOSE_FLOWER = "Good afternoon! Choose the flowers you want in the bouquet.";
	private static final String MESSAGE_ENTER_NUMBER_FLOWER = "Enter the number of the flower you want in the bouquet or if you want to exit enter - ";
	private static final String MESSAGE_ENTER_QUANTITY_FLOWERS = "Enter quantity of the flowers you want in the bouquet.";
	private static final String MESSAGE_ENTER_ANSWER_ON_COMPLETE_BOUGUET = "Would you like to complete the bouquet? Yes - 0, No - 1";
	private static final String CODE_ANSWER_NO = "1";

	public static List<Flower> getFlowers() {
		return flowers;
	}

	public static void setFlowers(List<Flower> flowers) {
		Bouquet.flowers = flowers;
	}

	public static void selectionFlowers() {
		boolean isFlagWhile = true;
		System.out.println(MESSAGE_CHOOSE_FLOWER);
		while (isFlagWhile == true) {
			DataBase.printFlowerNames();
			int numberFlower = enterNumberFlower();
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

	private static int enterNumberFlower() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numberFlower = 0;
		String number = "";
		do {
			System.out.println(MESSAGE_ENTER_NUMBER_FLOWER + DataBase.getFlowers().size());
			number = scan.nextLine();
		} while (Validation.validationEnterNumberFlower(number) == false);
		numberFlower = parseInt(number);
		return numberFlower;
	}

	private static int enterQuantityFlowers() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int quantityFlowers = 0;
		String quantity = "";
		do {
			System.out.println(MESSAGE_ENTER_QUANTITY_FLOWERS);
			quantity = scan.nextLine();
		} while (Validation.validationEnterQuantityFlowers(quantity) == false);
		quantityFlowers = parseInt(quantity);
		return quantityFlowers;
	}

	private static String enterAnswerOnCompleteBouguet() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(MESSAGE_ENTER_ANSWER_ON_COMPLETE_BOUGUET);
			answer = scan.nextLine();
		} while (Validation.validationEnterAnswerOnCompleteBouguet(answer) == false);
		return answer;
	}

	private static int parseInt(String number) {
		int numberFlower = Integer.parseInt(number);
		return numberFlower;
	}

	private static void addFlower(int number, int quantity) {
		Flower flower = DataBase.getFlowers().get(number);
		for (int i = 0; i < quantity; i++) {
			flowers.add(flower);
		}
	}

	private static void print() {
		for (Flower flower : flowers) {
			System.out.println(flower);
		}
	}
}