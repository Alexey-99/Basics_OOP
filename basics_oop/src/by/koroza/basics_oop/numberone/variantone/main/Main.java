/* Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * 
 * Методы: 
 * создать, +
 * переименовать, + 
 * вывести на консоль содержимое, 
 * дополнить, 
 * удалить. +
 * */

package by.koroza.basics_oop.numberone.variantone.main;

import java.io.IOException;

import by.koroza.basics_oop.numberone.variantone.entitiy.Directory;
import by.koroza.basics_oop.numberone.variantone.entitiy.File;
import by.koroza.basics_oop.numberone.variantone.entitiy.TextFile;

public class Main {

	public static void main(String[] args) throws IOException {
		Directory directoryMain = new Directory("resources");
		Directory directoryFile = new Directory(directoryMain, "numberOne");
		File file = new File(directoryFile, "textFile.txt");
		TextFile textFile = new TextFile(directoryFile, file);
		
		textFile.create("one");
		textFile.create("one.txt");
		
		textFile.rename("numberOneRename");
		textFile.rename("textFileRename.txt");
		
		
	}
}