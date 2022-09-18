package by.koroza.basics_oop.numberfive.flowercomposition.entity.packaging;

public class Packeging {
	private String type;
	private double price;
	private static final String LINE_TYPE = "Type: ";
	private static final String LINE_PRICE = "Price: ";
	private static final String OPERATION_NEXT_LINE = "\n";

	public Packeging(String type, double price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 1;
		int result = 31;
		result = result * prime + (type != null ? type.hashCode() : 1);
		result = result * prime + Double.hashCode(price);
		result = result * prime + (LINE_TYPE != null ? LINE_TYPE.hashCode() : 1);
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
		if (type == null) {
			if (packeging.type != null) {
				return false;
			}
		} else if (!type.equals(packeging.type)) {
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
		builder.append(LINE_TYPE).append(type).append(OPERATION_NEXT_LINE);
		builder.append(LINE_PRICE).append(price);
		return builder.toString();
	}
}