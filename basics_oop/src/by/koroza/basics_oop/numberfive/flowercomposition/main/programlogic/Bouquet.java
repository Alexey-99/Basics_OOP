package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase;

public class Bouquet {
	private static List<Object> flowers = new ArrayList<>();

	public static List<Object> getFlowers() {
		return flowers;
	}

	public static void setFlowers(List<Object> flowers) {
		Bouquet.flowers = flowers;
	}

	public static void selectionFlowers() {
		System.out.println("Good afternoon! Choose the flowers you want in the bouquet. Or click exit - 1");
		DataBase.printFlowerNames();
		int number;
	}

	private static void enterNumberFlower() {
		Scanner scan = new Scanner(System.in);
		int numberFlower = 0;
		String number = "";
		do {
			number = scan.nextLine();
		} while (false);

	}

}