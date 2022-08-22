/* Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * 
 * Методы: 
 * создать (file, derictory), 
 * переименовать (file, derictory), 
 * вывести на консоль содержимое(file), 
 * дополнить (file, derictory), 
 * удалить (file). 
 * */

package by.koroza.basics_oop.numberone.variantone.main;

import by.koroza.basics_oop.numberone.variantone.entitiy.Directory;
import by.koroza.basics_oop.numberone.variantone.entitiy.TextFile;

public class Main {

	public static void main(String[] args) { //TODO ПЕРЕДЕЛАТЬ
		Directory directory = new Directory("files");
		TextFile file = new TextFile("name", "content content1 content2 ");
		file.replenishContent("replenishContent");
		System.out.println(file.toString());
		directory.addFile(file);
		System.out.println(directory.toString());
		file.printContent();
		directory.deleteFile();
		System.out.println(directory.toString());
	}
}