package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.List;

import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;
import by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging.Packaging;

public class FlowerComposition {

	public static void createFlowerComposition() {
		List<Flower> flowers = CreateBouquet.selectionFlowers();
		if (flowers.size() > 0) {
			Packaging packaging = SelectionPackaging.selectionFlowers();
			printFlowers(flowers);
		}
	}

	private static void printFlowers(List<Flower> flowers) {
		System.out.println("You made a bouquet of the following flowers: ");
		for (int i = 0; i < flowers.size(); i++) {
			System.out.println(i + " - " + flowers.get(i));
		}
	}
}