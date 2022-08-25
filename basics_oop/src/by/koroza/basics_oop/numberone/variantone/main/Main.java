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
import by.koroza.basics_oop.numberone.variantone.entitiy.File;

public class Main {

	public static void main(String[] args) { //TODO ПЕРЕДЕЛАТЬ
		Directory directoryMain = new Directory("resouces");
		Directory directoryFile = new Directory(directoryMain, "numberOne");
		File file = new File(directoryFile, "textFile.txt");
	}
}