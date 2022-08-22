/* Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * 
 * Методы: 
 * создать (file, derictory), 
 * переименовать (file, derictory), 
 * вывести на консоль содержимое(file), 
 * дополнить (file, derictory), 
 * удалить (file). 
 * */

package by.koroza.basics_oop.numberone.varianttwo.main;

import java.io.IOException;
import java.util.Arrays;

import by.koroza.basics_oop.numberone.varianttwo.entitiy.Directoire;
import by.koroza.basics_oop.numberone.varianttwo.entitiy.File;
import by.koroza.basics_oop.numberone.varianttwo.entitiy.TextFile;

public class Main {

	public static void main(String[] args) throws IOException {
		Directoire directoire = new Directoire("resources");
		File file = new File(directoire, "text2.txt");

		TextFile textFile = new TextFile(directoire, file);
		
		textFile.printConsole();
		textFile.addText("TEXT ADDED");
		textFile.printConsole();
		textFile.deleted();
		textFile.create(directoire.getPath());
		textFile.create(directoire.getPath() + "/" + file.getName());
		textFile.rename("text4.txt");
		
		System.out.println(Arrays.toString(directoire.list()));
	}
}