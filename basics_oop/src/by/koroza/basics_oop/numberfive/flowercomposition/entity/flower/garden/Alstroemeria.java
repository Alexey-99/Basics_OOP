package by.koroza.basics_oop.numberfive.flowercomposition.entity.flower.garden;

public class Alstroemeria {
	private static String name = "alstroemeria";
	private double price;
	private static final String LINE_NAME = "Name: ";
	private static final String LINE_PRICE = "Price: ";
	
	public Alstroemeria() {
		 this.price = 1;
	}
	
	public Alstroemeria(double price) {
		this.price = price;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Alstroemeria.name = name;
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
		Alstroemeria alstroemeria = (Alstroemeria) object;
		if (price != alstroemeria.price) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() { 
		StringBuilder builder = new StringBuilder();
		builder.append(LINE_NAME).append(name);
		builder.append(LINE_PRICE).append(price);
		return builder.toString();
	}
}