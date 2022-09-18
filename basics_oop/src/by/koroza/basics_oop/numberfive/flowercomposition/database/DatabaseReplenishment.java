package by.koroza.basics_oop.numberfive.flowercomposition.database;

import static by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase.addFlower;
import static by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase.addpackagingType;

import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;;

public class DatabaseReplenishment {

	public static void databaseReplenishment() {
		replenishmentFlowerNames();
		replenishmentPackagingTypess();
	}

	private static void replenishmentFlowerNames() {
		addFlower(new Flower("Garden", "Alstroemeria", 10));
		addFlower(new Flower("Garden", "Anemone", 12));
		addFlower(new Flower("Garden", "Aster", 14));
		addFlower(new Flower("Garden", "Chrysanthemum", 16));
		addFlower(new Flower("Garden", "Lily", 18));
		addFlower(new Flower("Garden", "LilyOfTheValley", 20));
		addFlower(new Flower("Garden", "Peony", 22));
		addFlower(new Flower("Garden", "Rose", 24));
		addFlower(new Flower("Garden", "Tulip", 26));
	}

	private static void replenishmentPackagingTypess() {
		addpackagingType("Grid");
		addpackagingType("Paper");
		addpackagingType("Felt");
		addpackagingType("Hat box");
		addpackagingType("Frame");
	}

}