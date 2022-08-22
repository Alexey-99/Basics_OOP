/* Создать консольное приложение, удовлетворяющее следующим требованиям:  
•	Приложение должно быть объектно-, а не процедурно-ориентированным.  
•	Каждый класс должен иметь отражающее смысл название и информативный состав.  
•	Наследование должно применяться только тогда, когда это имеет смысл.  
•	При кодировании должны быть использованы соглашения об оформлении кода java code convention.  
•	Классы должны быть грамотно разложены по пакетам.  
•	Консольное меню должно быть минимальным.  
•	Для хранения данных можно использовать файлы. 
 
* Дракон и его сокровища. 
* Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
* Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
*/

package by.koroza.basics_oop.numberfour.main;

import java.io.IOException;

import by.koroza.basics_oop.numberfour.entity.Directoire;
import by.koroza.basics_oop.numberfour.entity.File;
import by.koroza.basics_oop.numberfour.entity.TextFile;
import by.koroza.basics_oop.numberfour.main.process.ProgramProcess;

public class Main {
	private static final String LINE_TREASURE_WITH_MIN_PRICE = "Treasure with minimum price";
	private static final String LINE_TREASURE_WITH_MAX_PRICE = "Treasure with maximum price";
	private static final String LINE_TREASURE_WITH_BETWEEN_SELECTED_PRICES = "Treasure with prices between selected";
	private static final String LINE_TREASURE_WITH_SELECTED_PRICE = "Treasure with selected price";
	private static final String OPERATION_NEXT_LINE = "\n";

	public static void main(String[] args) throws IOException {
		Directoire directoireMain = new Directoire("resources");

		Directoire directoire = new Directoire(directoireMain, "treasure");
		File file = new File(directoire, "treasureList.txt");

		TextFile textFile = new TextFile(directoire, file);
		textFile.printToFile();
		
		ProgramProcess.programProcess(textFile);
		
		/*System.out.println(LINE_TREASURE_WITH_MIN_PRICE);
		textFile.searchTreasureWithMinPrice(file);
		System.out.println(OPERATION_NEXT_LINE + LINE_TREASURE_WITH_MAX_PRICE);
		textFile.searchTreasureWithMaxPrice(file);
		System.out.println(OPERATION_NEXT_LINE + LINE_TREASURE_WITH_BETWEEN_SELECTED_PRICES); // 
		textFile.searchTreasureBetweenMinToMaxPrices(file, 100, 500);
		System.out.println(OPERATION_NEXT_LINE + LINE_TREASURE_WITH_SELECTED_PRICE);
		textFile.searchTreasureSelectedPrice(file, 300);*/
	}
}