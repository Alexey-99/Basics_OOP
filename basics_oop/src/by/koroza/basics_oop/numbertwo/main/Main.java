/* Создать класс Payment с внутренним классом, 
 * с помощью объектов которого можно сформировать покупку из нескольких товаров.
 * */

package by.koroza.basics_oop.numbertwo.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ProgramProcess.programProcess();
		enterNumberProductForBuy();
	}

	private static void enterNumberProductForBuy() {
		boolean flag = false;
		String number = "";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number:");
			if (scan.hasNextInt()) {
				number = scan.nextLine();
				flag = true;
			} 
		} while (flag == false);
		System.out.println("Number: " + number);
	}
	
}