package by.koroza.basics_oop.numberthree.entity;

public class Day {
	private int number;
	private boolean weekend;
	private boolean holiday;

	public Day(int number, boolean weekend, boolean holiday) {
		this.number = number;
		this.weekend = weekend;
		this.holiday = holiday;
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
	public String toString() { // TODO toString()
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}
}