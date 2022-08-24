package by.koroza.basics_oop.numberfour.process;

import java.io.FileNotFoundException;
import java.util.Scanner;

import by.koroza.basics_oop.numberfour.entity.TextFile;
import by.koroza.basics_oop.numberfour.validation.Validation;

public class ProgramProcess {
	private static final String LINE_TREASURE_WITH_MIN_PRICE = "Treasure with minimum price. (Enter 0)";
	private static final String LINE_TREASURE_WITH_MAX_PRICE = "Treasure with maximum price. (Enter 1) ";
	private static final String LINE_TREASURE_WITH_BETWEEN_SELECTED_PRICES = "Treasure with prices between selected. (Enter 2)";
	private static final String LINE_TREASURE_WITH_SELECTED_PRICE = "Treasure with selected price. (Enter 3)";
	private static final String LINE_LOG_OUT = "Log out. (Enter 4)";

	private static final String CODE_FIRST_OPERATION = "0";
	private static final String CODE_SECOND_OPERATION = "1";
	private static final String CODE_THIRD_OPERATION = "2";
	private static final String CODE_FOURTH_OPERATION = "3";
	private static final String CODE_FIFTH_OPERATION = "4";

	private static final String MESSAGE_ENTER_NUMBER_OPERATION = "Enter the operation number";
	private static final String MESSAGE_ENTER_FIRST_PRICE = "Enter first price.";
	private static final String MESSAGE_ENTER_SECOND_PRICE = "Enter second price.";

	private static final String OPERATION_NEXT_LINE = "\n";

	public static void programProcess(TextFile textFile) throws FileNotFoundException {
		boolean isFlagMain = true;
		while (isFlagMain == true) {
			printMainOperations();
			String number = enterNumberOperation();
			switch (number) {
			case CODE_FIRST_OPERATION:
				operationSearchMinPrice(textFile);
				break;
			case CODE_SECOND_OPERATION:
				operationSearchMaxPrice(textFile);
				break;
			case CODE_THIRD_OPERATION:
				operationSearchBetweenMinToMaxPrices(textFile);
				break;
			case CODE_FOURTH_OPERATION:
				operationSearchSelectedPrice(textFile);
				break;
			case CODE_FIFTH_OPERATION:
				isFlagMain = false;
				break;
			}
		}
	}

	private static void printMainOperations() {
		StringBuilder builder = new StringBuilder();
		builder.append(LINE_TREASURE_WITH_MIN_PRICE).append(OPERATION_NEXT_LINE);
		builder.append(LINE_TREASURE_WITH_MAX_PRICE).append(OPERATION_NEXT_LINE);
		builder.append(LINE_TREASURE_WITH_BETWEEN_SELECTED_PRICES).append(OPERATION_NEXT_LINE);
		builder.append(LINE_TREASURE_WITH_SELECTED_PRICE).append(OPERATION_NEXT_LINE);
		builder.append(LINE_LOG_OUT).append(OPERATION_NEXT_LINE);
		System.out.println(builder);
	}

	private static String enterNumberOperation() {
		String number = "";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(MESSAGE_ENTER_NUMBER_OPERATION);
			number = scan.nextLine();
		} while (Validation.enterNumberOperation(number) == false);
		return number;
	}

	private static void operationSearchMinPrice(TextFile textFile) throws FileNotFoundException {
		textFile.searchTreasureWithMinPrice(textFile.getFile());
	}

	private static void operationSearchMaxPrice(TextFile textFile) throws FileNotFoundException {
		textFile.searchTreasureWithMaxPrice(textFile.getFile());
	}

	private static void operationSearchBetweenMinToMaxPrices(TextFile textFile) throws FileNotFoundException {
		System.out.println(MESSAGE_ENTER_FIRST_PRICE);
		double priceFirst = enterPriceTreasure();
		System.out.println(MESSAGE_ENTER_SECOND_PRICE);
		double priceSecond = enterPriceTreasure();
		textFile.searchTreasureBetweenMinToMaxPrices(textFile.getFile(), priceFirst, priceSecond);
	}

	private static void operationSearchSelectedPrice(TextFile textFile) throws FileNotFoundException {
		double price = enterPriceTreasure();
		textFile.searchTreasureSelectedPrice(textFile.getFile(), price);
	}

	private static double enterPriceTreasure() {
		String price = "";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		do {
			price = scan.nextLine();
		} while (Validation.enterPriceTreasure(price) == false);
		double parceDouble = parseDouble(price);
		return parceDouble;
	}

	private static double parseDouble(String price) {
		double priceDouble = Double.parseDouble(price);
		return priceDouble;
	}
}