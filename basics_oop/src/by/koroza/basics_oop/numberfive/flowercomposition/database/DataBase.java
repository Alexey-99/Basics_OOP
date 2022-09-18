package by.koroza.basics_oop.numberfive.flowercomposition.database;

import java.util.ArrayList;
import java.util.List;

import by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.Flower;

public class DataBase {
	// private static List<String> flowerNames = new ArrayList<>();
	private static List<Flower> flowers = new ArrayList<>();

	private static List<String> packagingTypes = new ArrayList<>();

//	public static List<String> getFlowerNames() {
//		return flowerNames;
//	}
//
//	public static void setFlowerNames(List<String> flowerNames) {
//		DataBase.flowerNames = flowerNames;
//	}

	public static List<String> getPackagingTypes() {
		return packagingTypes;
	}

	public static void setPackagingTypes(List<String> packagingTypes) {
		DataBase.packagingTypes = packagingTypes;
	}

//	public static void addFlowerName(String name) {
//		DataBase.flowerNames.add(name);
//	}

	public static void addpackagingType(String type) {
		DataBase.packagingTypes.add(type);
	}

//	public static void printFlowerNames() {
//		for (int i = 0; i < flowerNames.size(); i++) {
//			System.out.println(i + " - " + flowerNames.get(i));
//		}
//	}

	//

	//

	public static List<Flower> getFlowers() {
		return flowers;
	}

	public static void setFlowers(List<Flower> flowers) {
		DataBase.flowers = flowers;
	}

	public static void addFlower(Flower flower) {
		DataBase.flowers.add(flower);
	}

	public static void printFlowerNames() {
		for (int i = 0; i < flowers.size(); i++) {
			System.out.println(i + " - " + flowers.get(i).getName());
		}
	}
}