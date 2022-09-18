package by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic;

import java.util.List;

import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;
import by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging.Packaging;

public class FlowerComposition {

	public static void createFlowerComposition() {
		List<Flower> flowers = CreateBouquet.selectionFlowers();
		Packaging packaging = SelectionPackaging.selectionFlowers();
	}

}
