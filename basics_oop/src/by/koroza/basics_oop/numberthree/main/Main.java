/* Создать класс Календарь с внутренним классом, 
 * с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 * */

package by.koroza.basics_oop.numberthree.main;

//import java.time.Year;

import by.koroza.basics_oop.numberthree.entity.Сalendar;
import by.koroza.basics_oop.numberthree.entity.Year;

public class Main {

	public static void main(String[] args) {
		Сalendar calendar = new Сalendar();
		calendar.addYear(new Year(2022));
	}
}