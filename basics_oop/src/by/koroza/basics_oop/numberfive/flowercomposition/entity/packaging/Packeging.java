package by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging;

public class Packeging {
	private String name;
	private double price;
	private static final String LINE_NAME = "Name: ";
	private static final String LINE_PRICE = "Price: ";
	private static final String OPERATION_NEXT_LINE = "\n";

	public Packeging(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		int prime = 1;
		int result = 31;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + Double.hashCode(price);
		result = result * prime + (LINE_NAME != null ? LINE_NAME.hashCode() : 1);
		result = result * prime + (LINE_PRICE != null ? LINE_PRICE.hashCode() : 1);
		result = result * prime + (OPERATION_NEXT_LINE != null ? OPERATION_NEXT_LINE.hashCode() : 1);
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
		Packeging packeging = (Packeging) object;
		if (name == null) {
			if (packeging.name != null) {
				return false;
			}
		} else if (!name.equals(packeging.name)) {
			return false;
		}
		if (price != packeging.price) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(LINE_NAME).append(name).append(OPERATION_NEXT_LINE);
		builder.append(LINE_PRICE).append(price);
		return builder.toString();
	}
}