package by.koroza.basics_oop.numberfour.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {
	private static final String LINE_TWO_SPACE = "  ";
	private static final String LINE_NUMBER_FIRST_LINE = "0";

	public void searchTreasureWithMinPrice(File file) throws FileNotFoundException {
		double minPrice = findMinPrice(file);
		printTreasureWithSelectedPrice(file, minPrice);
	}

	public void searchTreasureWithMaxPrice(File file) throws FileNotFoundException {
		double maxPrice = findMaxPrice(file);
		printTreasureWithSelectedPrice(file, maxPrice);
	}

	public void searchTreasureBetweenMinToMaxPrices(File file, double minPrice, double maxPrice)
			throws FileNotFoundException {
		printTreasureBetweenMinToMaxPrices(file, minPrice, maxPrice);
	}

	public void searchTreasureSelectedPrice(File file, double price) throws FileNotFoundException {
		printTreasureWithSelectedPrice(file, price);
	}

	private double findMinPrice(File file) throws FileNotFoundException {
		double minPrice = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] array = line.split(LINE_TWO_SPACE);
			if (array[0].equals(LINE_NUMBER_FIRST_LINE)) {
				minPrice = Double.parseDouble(array[2]);
			}
			double price = Double.parseDouble(array[2]);
			if (minPrice > price) {
				double priceBuffer = minPrice;
				minPrice = price;
				price = priceBuffer;
			}
		}
		System.out.println("MIN:" + minPrice);
		return minPrice;
	}

	private double findMaxPrice(File file) throws FileNotFoundException {
		double maxPrice = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] array = line.split(LINE_TWO_SPACE);
			if (array[0].equals(LINE_NUMBER_FIRST_LINE)) {
				maxPrice = Double.parseDouble(array[2]);
			}
			double price = Double.parseDouble(array[2]);
			if (maxPrice < price) {
				double priceBuffer = maxPrice;
				maxPrice = price;
				price = priceBuffer;
			}
		}
		System.out.println("MAX:" + maxPrice);
		return maxPrice;
	}

	private void printTreasureWithSelectedPrice(File file, double price) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] array = line.split(LINE_TWO_SPACE);
			double priceTreasure = Double.parseDouble(array[2]);
			if (priceTreasure == price) {
				System.out.println(line);
			}
		}
	}

	private void printTreasureBetweenMinToMaxPrices(File file, double minPrice, double maxPrice)
			throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] array = line.split(LINE_TWO_SPACE);
			double priceTreasure = Double.parseDouble(array[2]);
			if (priceTreasure >= minPrice && priceTreasure <= maxPrice) {
				System.out.println(line);
			}
		}
	}
}