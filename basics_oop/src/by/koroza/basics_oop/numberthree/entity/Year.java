package by.koroza.basics_oop.numberthree.entity;

public class Year {
	private int number;
	private Month[] month;

	public Year(int number) {
		this.number = number;
		this.month = new Month[0];
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Month[] getMonth() {
		return month;
	}

	public void setMonth(Month[] month) {
		this.month = month;
	}

	public void addMonth(Month month) { // TODO addMonth(Month month)

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + number;
		result = result * prime + (month != null ? month.hashCode() : 1);
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
		if (month == null) {
			if (year.month != null) {
				return false;
			}
		} else if (!month.equals(year.month)) {
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