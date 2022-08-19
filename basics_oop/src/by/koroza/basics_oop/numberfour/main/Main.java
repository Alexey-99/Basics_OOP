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

import by.koroza.basics_oop.numberone.varianttwo.entitiy.Directoire;
import by.koroza.basics_oop.numberone.varianttwo.entitiy.File;
import by.koroza.basics_oop.numberone.varianttwo.entitiy.TextFile;

public class Main {

	public static void main(String[] args) throws IOException {
		createFile();
	}
	
	private static void createFile() throws IOException {
		Directoire directoire = new Directoire("resources1");
		File file = new File(directoire, "text2.txt");

		TextFile textFile = new TextFile(directoire, file);

//        TextFile textFile = new TextFile();
//        textFile.create("src/resources/text/text2");
//        textFile.create("src/resources/text/text2/text2.txt");
		textFile.printConsole();
		textFile.addText("TEXT ADDED");
		textFile.printConsole();
		textFile.deleted();
		textFile.create(directoire.getPath());
		textFile.create(directoire.getPath() + "/" + file.getName());
		textFile.rename("text4.txt");
	}
}