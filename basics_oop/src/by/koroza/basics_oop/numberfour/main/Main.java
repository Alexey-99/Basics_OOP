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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		Directoire directoireMain = new Directoire("resources");
		directoireMain.mkdirs();
		Directoire directoire = new Directoire(directoireMain, "treasure");
		File file = new File(directoire, "treasureList.txt");
		TextFile textFile = new TextFile(directoire, file);
		
		//textFile.delete();
		
		

	}
	
	public static void printWriter(File file) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(file);
		pw.println("Hello");
		pw.println("Hello");
		pw.close();
	}

}