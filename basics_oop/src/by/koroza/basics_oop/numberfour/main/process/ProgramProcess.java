package by.koroza.basics_oop.numberfour.main.process;

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
	private static final String MESSAGE_ENTER_NUMBER_OPERATION = "Enter the operation number";

	private static final String OPERATION_NEXT_LINE = "\n";

	public static void programProcess(TextFile textFile) throws FileNotFoundException {
		boolean isFlagMain = true;
		while (isFlagMain == true) {
			printMainOperations();
			String number = enterNumberOperation();
			switch (number) {
			case "0":
				textFile.searchTreasureWithMinPrice(textFile.getFile());
				break;
			case "1":
				textFile.searchTreasureWithMaxPrice(textFile.getFile());
				break;
			case "2":
				textFile.searchTreasureBetweenMinToMaxPrices(textFile.getFile(), 100, 500); // TODO
				break;
			case "3":
				textFile.searchTreasureSelectedPrice(textFile.getFile(), 300); // TODO
				break;
			case "4":
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
}