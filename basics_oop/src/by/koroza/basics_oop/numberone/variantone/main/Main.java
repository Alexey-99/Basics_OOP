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
		File file1 = new File(directoryFile, "textFile1.txt");
		TextFile textFile1 = new TextFile(directoryFile, file1);
		// textFile.create("one");
		// textFile.create("one.txt");
		textFile1.rename("text.txt");
		//textFile.rename("textfile.txt");
		
		
		File file2 = new File(directoryFile, "textFile1.txt");
		TextFile textFile2 = new TextFile(directoryFile, file2);
		
		
		File file3 = new File(directoryFile, "textFile3.txt");
		TextFile textFile3 = new TextFile(directoryFile, file3);
		textFile3.rename("textfile.txt");
	}
}