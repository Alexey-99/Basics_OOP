package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.List;

import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;
import by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging.Packaging;

public class FlowerComposition {
	private static final String MESSAGE_YOU_MADE_BOUQUET = "You made a bouquet of the following flowers: ";
	private static final String MESSAGE_YOU_CHOSEN_PACKAGING = "You have chosen the following packaging for flowers: ";
	private static final String MESSAGE_YOU_NOT_CHOSEN_PACKAGING = "You have not selected flower packaging.";
	
	private static final String MESSAGE_COST_FLOWERS = "Cost of the flowers: ";
	private static final String MESSAGE_COST_PACKAGING = "Cost of the packaging: ";
	private static final String MESSAGE_COST_FLOWER_COMPASITION = "Cost of the flower compasition: ";
	
	public static void createFlowerComposition() {
		List<Flower> flowers = CreateBouquet.selectionFlowers();
		if (flowers.size() > 0) {
			Packaging packaging = SelectionPackaging.selectionFlowers();
			printFlowers(flowers);
			printPackaging(packaging);
			printPriceOfFlowerComposition(flowers, packaging);
		}
	}

	private static void printFlowers(List<Flower> flowers) {
		System.out.println(MESSAGE_YOU_MADE_BOUQUET);
		for (int i = 0; i < flowers.size(); i++) {
			System.out.println((i + 1) + " - " + flowers.get(i));
		}
	}

	private static void printPackaging(Packaging packaging) {
		if (packaging != null) {
			System.out.println(MESSAGE_YOU_CHOSEN_PACKAGING);
			System.out.println(packaging.toString());
		} else {
			System.out.println(MESSAGE_YOU_NOT_CHOSEN_PACKAGING);
		}
	}

	private static void printPriceOfFlowerComposition(List<Flower> flowers, Packaging packaging) {
		double pricePackaging = 0;
		double priceFlowers = calculationCostFlowers(flowers);
		System.out.println(MESSAGE_COST_FLOWERS + priceFlowers);
		if (packaging != null) {
			pricePackaging = calculationCostPackaging(packaging);
			System.out.println(MESSAGE_COST_PACKAGING + pricePackaging);
		}
		double priceFlowerCompasition = priceFlowers + pricePackaging;
		System.out.println(MESSAGE_COST_FLOWER_COMPASITION + priceFlowerCompasition);

	}

	private static double calculationCostFlowers(List<Flower> flowers) {
		double cost = 0;
		for (Flower flower : flowers) {
			cost += flower.getPrice();
		}
		return cost;
	}

	private static double calculationCostPackaging(Packaging packaging) {
		double cost = 0;
		if (packaging != null) {
			cost += packaging.getPrice();
		}
		return cost;
	}
}