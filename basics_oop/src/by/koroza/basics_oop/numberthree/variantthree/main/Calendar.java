package by.koroza.basics_oop.numberthree.variantthree.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<LocalDate> holidays;

	public Calendar() {
		this.holidays = new ArrayList<LocalDate>();
	}

	public List<LocalDate> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<LocalDate> holidays) {
		this.holidays = holidays;
	}

	public void addHolidays(LocalDate holiday) {
		this.holidays.add(holiday);
	}

	public void printWeekendsAndHolidays(LocalDate dateStart, LocalDate dateFinish) {
		for (LocalDate i = dateStart; !i.isAfter(dateFinish); i = i.plusDays(1)) {

		}
	}

	private class Validation{
		
		public
	}
}