package by.koroza.basics_oop.numberfour.main.process;

import java.util.Scanner;

public class ProgramProcess {
	private static final String LINE_TREASURE_WITH_MIN_PRICE = "Treasure with minimum price. (Enter 0)";
	private static final String LINE_TREASURE_WITH_MAX_PRICE = "Treasure with maximum price. (Enter 1) ";
	private static final String LINE_TREASURE_WITH_BETWEEN_SELECTED_PRICES = "Treasure with prices between selected. (Enter 2)";
	private static final String LINE_TREASURE_WITH_SELECTED_PRICE = "Treasure with selected price. (Enter 3)";
	private static final String LINE_LOG_OUT = "Log out. (Enter 4)";
	private static final String OPERATION_NEXT_LINE = "\n";

	public static void programProcess() {
		boolean isFlagMain = true;
		while (isFlagMain == true) {
			printMainOperations();
			enterNumberOperation();
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

	private static void enterNumberOperation() {
		int number = 0;
		Scanner scan = new Scanner(System.in);
		do {
			if (scan.hasNextInt()) {
				number = scan.nextInt();
			}

		} while (true);
	}
}