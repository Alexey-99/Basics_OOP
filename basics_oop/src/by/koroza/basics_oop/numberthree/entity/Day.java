package by.koroza.basics_oop.numberthree.entity;

public class Day {
	private int number;
	private boolean weekend;
	private boolean holiday;
	
	public Day(int number, boolean weekend, boolean holiday) {
		
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

}
