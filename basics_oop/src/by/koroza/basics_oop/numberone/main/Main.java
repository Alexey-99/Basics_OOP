/* Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * 
 * Методы: 
 * создать, +
 * переименовать, + 
 * вывести на консоль содержимое, +
 * дополнить, 
 * удалить. +
 * */

package by.koroza.basics_oop.numberone.main;

import java.io.IOException;

import by.koroza.basics_oop.numberone.entity.Directory;
import by.koroza.basics_oop.numberone.entity.File;
import by.koroza.basics_oop.numberone.entity.TextFile;

public class Main {

	public static void main(String[] args) throws IOException {
		Directory directoryMain = new Directory("resources");
		Directory directoryFile = new Directory(directoryMain, "numberOne");
		File file = new File(directoryFile, "textFile.txt");
		TextFile textFile = new TextFile(directoryFile, file);
		
		textFile.create("numberOneNew1");
		textFile.create("textFileNew1.txt");
		
		textFile.deleteDirectory();
		textFile.deleteFile();
		
		textFile.create(directoryFile, "numberOneNew2");
		textFile.create(textFile.getDirectory(), "textFileNew2.txt");
		
		textFile.rename("numberOne2Rename");
		textFile.rename("textFileNew2Rename.txt");
		
		textFile.addText(
				"""
					   Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur sed tempor risus, 
					vitae egestas diam. Vestibulum nec lacus ut ligula maximus porta ut nec sapien. Suspendisse 
					ultricies consectetur nisi, in vulputate lorem fringilla et. Cras ut risus congue felis 
					volutpat pharetra. Praesent placerat eget risus ac tempor. Curabitur tincidunt sed mauris 
					in rhoncus. Quisque arcu erat, ornare sit amet magna sit amet, dapibus convallis eros. 
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ante ipsum primis in 
					faucibus orci luctus et ultrices posuere cubilia curae.
						""");
		
		textFile.printToConsole();
		
		
	}
}