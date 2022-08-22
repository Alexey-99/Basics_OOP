package by.koroza.basics_oop.numberfour.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {
	private static final String LINE_TWO_SPACE = "  ";
	private static final String LINE_NUMBER_FIRST_LINE = "0";

	public void searchTreasureWithMinPrice(File file) throws FileNotFoundException {
		double minPrice = findMinPrice(file);
		printTreasureWithMinPrice(file, minPrice);
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
		System.out.println(minPrice);
		return minPrice;
	}

	private void printTreasureWithMinPrice(File file, double minPrice) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] array = line.split(LINE_TWO_SPACE);
			double price = Double.parseDouble(array[2]);
			if (price == minPrice) {
				System.out.println(line);
			}
		}
	}
}