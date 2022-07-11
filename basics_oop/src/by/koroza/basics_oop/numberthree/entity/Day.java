package by.koroza.basics_oop.numberthree.entity;

public class Day {
	private int number;
	private boolean weekend;
	private boolean holiday;
	private static final String LINE_NUMBER = "Number: ";
	private static final String NEXT_LINE = "\n";
	private static final String LINE_WEEKEND = "This day is weekend.";
	private static final String LINE_HOLIDAY = "This day is holiday.";

	public Day(int number, boolean weekend, boolean holiday) {
		this.number = number;
		this.weekend = weekend;
		this.holiday = holiday;
	}

	public Day(int number, boolean weekend) {
		this.number = number;
		this.weekend = weekend;
		this.holiday = false;
	}

	public Day(int number) {
		this.number = number;
		this.weekend = false;
		this.holiday = false;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

	public boolean isWeekend() {
		return weekend;
	}

	public void setWeekend(boolean weekend) {
		this.weekend = weekend;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + number;
		result = result * prime + Boolean.hashCode(weekend);
		result = result * prime + Boolean.hashCode(holiday);
		result = result * prime + (LINE_NUMBER != null ? LINE_NUMBER.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (LINE_WEEKEND != null ? LINE_WEEKEND.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Day day = (Day) object;
		if (number != day.number) {
			return false;
		}
		if (weekend != day.weekend) {
			return false;
		}
		if (holiday != day.holiday) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(LINE_NUMBER).append(number).append(NEXT_LINE);
		if (weekend == true) {
			builder.append(LINE_WEEKEND).append(NEXT_LINE);
		}
		if (holiday == true) {
			builder.append(LINE_HOLIDAY).append(NEXT_LINE);
		}
		return builder.toString();
	}
}