package by.koroza.basics_oop.numberthree.variantone.entity;

public class Сalendar {
	private Year[] years;
	private static final String NEXT_LINE = "\n";
	private static final int ONE_ELEMENT = 1;

	public Сalendar() {
		this.years = new Year[0];
	}

	public Сalendar(Year[] years) {
		this.years = years;
	}

	public Сalendar(Year year) {
		this.years = new Year[1];
		this.years[0] = year;
	}

	public Year[] getYears() {
		return years;
	}

	public void setYears(Year[] years) {
		this.years = years;
	}

	public void addYear(Year year) {
		Year[] yearsNew = new Year[this.years.length + ONE_ELEMENT];
		for (int i = 0; i < yearsNew.length; i++) {
			if (i < this.years.length) {
				yearsNew[i] = this.years[i];
			} else if (i == this.years.length) {
				yearsNew[i] = year;
			}
		}
		this.years = yearsNew;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (years != null ? years.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + ONE_ELEMENT;
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Year year : years) {
			builder.append(year.toString()).append(NEXT_LINE);
		}
		return builder.toString();
	}
}