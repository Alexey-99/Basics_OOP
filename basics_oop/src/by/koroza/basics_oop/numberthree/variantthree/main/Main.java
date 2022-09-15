/* Создать класс Календарь с внутренним классом, 
   с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
*/

package by.koroza.basics_oop.numberthree.variantthree.main;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();

		calendar.addHolidays(LocalDate.of(2022, Month.JANUARY, 1));
		calendar.addHolidays(LocalDate.of(2022, Month.JANUARY, 2));
		calendar.addHolidays(LocalDate.of(2022, Month.JANUARY, 7));
		calendar.addHolidays(LocalDate.of(2022, Month.MARCH, 8));
		calendar.addHolidays(LocalDate.of(2022, Month.MAY, 1));
		calendar.addHolidays(LocalDate.of(2022, Month.MAY, 3));
		calendar.addHolidays(LocalDate.of(2022, Month.MAY, 9));
		calendar.addHolidays(LocalDate.of(2022, Month.JULY, 3));
		calendar.addHolidays(LocalDate.of(2022, Month.NOVEMBER, 7));
		calendar.addHolidays(LocalDate.of(2022, Month.DECEMBER, 25));

		calendar.printWeekendsAndHolidays(LocalDate.of(2022, Month.MARCH, 1), LocalDate.of(2022, Month.JULY, 31));
	}
}