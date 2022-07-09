package by.koroza.basics_oop.numbertwo.entity;

public class Product {
	private static int count = 1;

	private int id;
	private String name;
	private double price;
	private boolean status;
	private static final String LINE_PRODUCT_NAME = "Product name: ";
	private static final String LINE_PRODUCT_PRICE = "Product price: ";
	private static final String NEXT_LINE = "\n";
	private static final String MESSAGE_PRODUCT_RESERVED = "This product reserved.";

	public Product(String name, double price) {
		this.id = count++;
		this.name = name;
		this.price = price;
		this.status = true;
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

	public boolean getIsStatus() {
		return status;
	}

	public void setIsStatus(boolean status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + Double.hashCode(price);
		result = result * prime + Boolean.hashCode(status);
		result = result * prime + (LINE_PRODUCT_NAME != null ? LINE_PRODUCT_NAME.hashCode() : 1);
		result = result * prime + (LINE_PRODUCT_PRICE != null ? LINE_PRODUCT_PRICE.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (MESSAGE_PRODUCT_RESERVED != null ? MESSAGE_PRODUCT_RESERVED.hashCode() : 1);
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
		if (status != product.status) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(LINE_PRODUCT_NAME).append(name).append(NEXT_LINE);
		builder.append(LINE_PRODUCT_PRICE).append(price).append(NEXT_LINE);
		if (status == false) {
			builder.append(MESSAGE_PRODUCT_RESERVED).append(NEXT_LINE);
		}
		return builder.toString();
	}
}