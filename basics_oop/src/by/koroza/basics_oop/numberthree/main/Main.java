/* Создать класс Календарь с внутренним классом, 
 * с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 * */

package by.koroza.basics_oop.numberthree.main;

import by.koroza.basics_oop.numberthree.entity.Сalendar;
import by.koroza.basics_oop.numberthree.entity.Day;
import by.koroza.basics_oop.numberthree.entity.Month;
import by.koroza.basics_oop.numberthree.entity.Year;

public class Main {

	public static void main(String[] args) {
		Day[] daysJule = { new Day(1), new Day(2), new Day(3), new Day(4), new Day(5, true) };
		Month jule = new Month("Jule", daysJule);
		Day[] daysJune = { new Day(1, true, true), new Day(2), new Day(3), new Day(4), new Day(5) };
		Month june = new Month("June", daysJune);
		Month[] months = { jule, june };
		Сalendar calendar = new Сalendar(new Year(2022, months));
		System.out.println(calendar.toString());

	}
}