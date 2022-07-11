package by.koroza.basics_oop.numberthree.entity;

public class Month {
	private String name;
	private Day[] days;

	public Month(String name) {
		this.name = name;
		this.days = new Day[0];
	}

	public Month(String name, Day[] days) {
		this.name = name;
		this.days = days;
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

	public void addDay(Day day) { // TODO addDay(Day day)

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (days != null ? days.hashCode() : 1);
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
		Month month = (Month) object;
		if (name == null) {
			if (month.name != null) {
				return false;
			}
		} else if (!name.equals(month.name)) {
			return false;
		}
		if (days == null) {
			if (month.days != null) {
				return false;
			}
		} else if (!days.equals(month.days)) {
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