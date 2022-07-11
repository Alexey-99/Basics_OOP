package by.koroza.basics_oop.numberthree.entity;

public class Month {
	private String name;
	private Day[] days;

	public Month(String name) {
		this.name = name;
		this.days = new Day[0];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Day[] getDays() {
		return days;
	}

	public void setDays(Day[] days) {
		this.days = days;
	}
}
