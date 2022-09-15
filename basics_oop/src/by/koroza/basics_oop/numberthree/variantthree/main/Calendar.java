package by.koroza.basics_oop.numberthree.variantthree.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<LocalDate> holidays;
	private Validation validation;

	public Calendar() {
		this.holidays = new ArrayList<LocalDate>();
		this.validation = new Validation();
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
		for (LocalDate day = dateStart; !day.isAfter(dateFinish); day = day.plusDays(1)) {
			if ((this.validation.isHoliday(day) == true) || this.validation.isWeekend(day) == true) {

			}
		}
	}

	private class Validation {

		public boolean isWeekend(LocalDate date) {
			boolean isWeekend = false;
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			if (dayOfWeek == DayOfWeek.SATURDAY) {
				isWeekend = true;
			}
			return isWeekend;
		}

		public boolean isHoliday(LocalDate date) {
			boolean isHoliday = false;
			for (LocalDate day : holidays) {
				if (date.isEqual(day)) {
					isHoliday = true;
				}
			}
			return isHoliday;
		}
	}
}