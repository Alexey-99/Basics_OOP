package by.koroza.basics_oop.numberfive.flowercomposition.database;

import java.util.ArrayList;
import java.util.List;

import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;
import by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging.Packaging;


public class DataBase {
	private static List<Flower> flowers = new ArrayList<>();
	private static List<Packaging> packagings = new ArrayList<>();

	public static List<Flower> getFlowers() {
		return flowers;
	}

	public static void setFlowers(List<Flower> flowers) {
		DataBase.flowers = flowers;
	}

	public static List<Packaging> getPackagings() {
		return packagings;
	}

	public static void setPackagings(List<Packaging> packagings) {
		DataBase.packagings = packagings;
	}

	public static void addFlower(Flower flower) {
		DataBase.flowers.add(flower);
	}

	public static void addPackaging(Packaging packaging) {
		DataBase.packagings.add(packaging);
	}

	public static void printFlowerNames() {
		for (int i = 0; i < flowers.size(); i++) {
			System.out.println(i + " - " + flowers.get(i).getName());
		}
	}

	public static void printPackagingTypes() {
		for (int i = 0; i < packagings.size(); i++) {
			System.out.println(i + " - " + packagings.get(i).getType());
		}
	}
}