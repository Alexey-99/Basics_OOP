package by.koroza.basics_oop.numberthree.entity;

public class Сalendar {
	private Year[] years;

	public Сalendar() {
		this.years = new Year[0];
	}

	public Сalendar(Year[] years) {
		this.years = years;
	}

	public Year[] getYears() {
		return years;
	}

	public void setYears(Year[] years) {
		this.years = years;
	}

	public void addYear(Year year) { // TODO addYear(Year year)

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (years != null ? years.hashCode() : 1);
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
		Сalendar сalendar = (Сalendar) object;
		if (years == null) {
			if (сalendar.years != null) {
				return false;
			}
		} else if (!years.equals(сalendar.years)) {
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