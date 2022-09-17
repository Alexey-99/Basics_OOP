package by.koroza.basics_oop.numberfive.flowercomposition.database;

import static by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase.addFlowerName;
import static by.koroza.basics_oop.numberfive.flowercomposition.database.DataBase.addpackagingType;;

public class DatabaseReplenishment {
	
	public static void databaseReplenishment() {
		replenishmentFlowerNames();
		replenishmentPackagingTypess();
	}
	
	private static void replenishmentFlowerNames() {
		addFlowerName("Alstroemeria");
		addFlowerName("Anemone");
		addFlowerName("Aster");
		addFlowerName("Chrysanthemum");
		addFlowerName("Lily");
		addFlowerName("LilyOfTheValley");
		addFlowerName("Peony");
		addFlowerName("Rose");
		addFlowerName("Tulip");
	}
	
	private static void replenishmentPackagingTypess() {
		addpackagingType("Grid");
		addpackagingType("Paper");
		addpackagingType("Felt");
		addpackagingType("Hat box");
		addpackagingType("Frame");
	}
	
	
}