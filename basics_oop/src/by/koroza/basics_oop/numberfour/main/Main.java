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

public class Main {

	public static void main(String[] args) throws IOException {
		Directoire directoireMain = new Directoire("resources");
		
		Directoire directoire = new Directoire(directoireMain, "treasure");
		File file = new File(directoire, "treasureList.txt");
		
		TextFile textFile = new TextFile(directoire, file);
		textFile.printToFile();
		textFile.searchTreasureWithMinPrice(file);
		textFile.searchTreasureWithMaxPrice(file);
		textFile.searchTreasureBetweenMinToMaxPrices(file, 100, 500);
		textFile.searchTreasureSelectedPrice(file, 300);
		
		//textFile.delete();
		
	}
}