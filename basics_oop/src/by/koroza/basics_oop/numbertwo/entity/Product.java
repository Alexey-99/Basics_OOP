package by.koroza.basics_oop.numbertwo.entity;

public class Product {
	private String name;
	private double price;
	private static final String PRODUCT_NAME = "Product name: ";
	private static final String PRODUCT_PRICE = "Product price: ";
	private static final String NEXT_LINE = "\n";

	public Product(String name, double price) {
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
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + Double.hashCode(price);
		result = result * prime + (PRODUCT_NAME != null ? PRODUCT_NAME.hashCode() : 1);
		result = result * prime + (PRODUCT_PRICE != null ? PRODUCT_PRICE.hashCode() : 1);
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
		Product product = (Product) object;
		if (name == null) {
			if (product.name != null) {
				return false;
			}
		} else if (!name.equals(product.name)) {
			return false;
		}
		if (price != product.price) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(PRODUCT_NAME).append(name).append(NEXT_LINE);
		builder.append(PRODUCT_PRICE).append(price);
		return builder.toString();
	}
}