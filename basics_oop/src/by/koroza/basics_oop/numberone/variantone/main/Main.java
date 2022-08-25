/* Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * 
 * Методы: 
 * создать (file, derictory), +
 * переименовать (file, derictory), 
 * вывести на консоль содержимое(file), 
 * дополнить (file, derictory), 
 * удалить. +
 * */

package by.koroza.basics_oop.numberone.variantone.main;

import java.io.IOException;

import by.koroza.basics_oop.numberone.variantone.entitiy.Directory;
import by.koroza.basics_oop.numberone.variantone.entitiy.File;
import by.koroza.basics_oop.numberone.variantone.entitiy.TextFile;

public class Main {

	public static void main(String[] args) throws IOException { // TODO ПЕРЕДЕЛАТЬ
		Directory directoryMain = new Directory("resources");
		Directory directoryFile = new Directory(directoryMain, "numberOne");
		directoryFile.renameTo(directoryMain);
		File file = new File(directoryFile, "textFile.txt");
		TextFile textFile = new TextFile(directoryFile, file);
	}
}