/* Создать консольное приложение, удовлетворяющее следующим требованиям:  
•	Корректно спроектируйте и реализуйте предметную область задачи.  
•	Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования. 
•	Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента. 
•	для проверки корректности переданных данных можно применить регулярные выражения. 
•	Меню выбора действия пользователем можно не реализовывать, используйте заглушку. 
•	Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

   Вариант A. 
   Цветочная композиция. 
   Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию). 
   Составляющими цветочной композиции являются цветы и упаковка. 
*/

package by.koroza.basics_oop.numberfive.flowercomposition.main;

import by.koroza.basics_oop.numberfive.flowercomposition.database.DatabaseReplenishment;
import by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic.CreateBouquet;
import by.koroza.basics_oop.numberfive.flowercomposition.main.programlogic.FlowerComposition;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		databaseReplenishment();
		FlowerComposition.createFlowerComposition();

	}

	private static void databaseReplenishment() {
		DatabaseReplenishment.databaseReplenishment();
	}

}