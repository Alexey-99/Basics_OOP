package by.koroza.basics_oop.numberthree.entity;

public class Year {
	private int number;
	private Month[] months;
	private static final String NEXT_LINE = "\n";

	public Year(int number) {
		this.number = number;
		this.months = new Month[0];
	}

	public Year(int number, Month[] months) {
		this.number = number;
		this.months = months;
	}

	public Year(int number, Month month) {
		this.number = number;
		this.months = new Month[1];
		this.months[0] = month;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Month[] getMonths() {
		return months;
	}

	public void setMonths(Month[] months) {
		this.months = months;
	}

	public void addMonth(Month month) { // TODO addMonth(Month month)

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + number;
		result = result * prime + (months != null ? months.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
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
		Year year = (Year) object;
		if (number != year.number) {
			return false;
		}
		if (months == null) {
			if (year.months != null) {
				return false;
			}
		} else if (!months.equals(year.months)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(number).append(NEXT_LINE);
		for (Month month : months) {
			builder.append(month.toString()).append(NEXT_LINE);
		}
		return builder.toString();
	}
}