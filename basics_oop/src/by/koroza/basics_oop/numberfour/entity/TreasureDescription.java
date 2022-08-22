package by.koroza.basics_oop.numberfour.entity;

import java.util.Random;

public class TreasureDescription {
	private static int count = 0;
	private static final String DEFAULT_NAME = "Treasure";
	private static final double MAX_PRICE = 1000;
	private static final String LINE_TWO_SPACE = "  ";

	private int number;
	private String name;
	private double price;

	public TreasureDescription() {
		this.number = count++;
		this.name = DEFAULT_NAME;
		this.price = decarationPrice();
	}

	public TreasureDescription(String name) {
		this.number = count++;
		this.name = name;
		this.price = decarationPrice();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	private double decarationPrice() {
		double price = 0;
		Random rand = new Random();
		price = rand.nextInt((int)MAX_PRICE);
		return price;
	}

	@Override
	public int hashCode() {
		int prime = 1;
		int result = 31;
		result = result * prime + count;
		result = result * prime + (DEFAULT_NAME != null ? DEFAULT_NAME.hashCode() : 1);
		result = result * prime + Double.hashCode(MAX_PRICE);
		result = result * prime + number;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + Double.hashCode(price);
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
		TreasureDescription description = (TreasureDescription) object;
		if (number != description.number) {
			return false;
		}
		if (name == null) {
			if (description.name != null) {
				return false;
			}
		} else if (!name.equals(description.name)) {
			return false;
		}
		if (price != description.price) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(number).append(LINE_TWO_SPACE).append(name).append(LINE_TWO_SPACE).append(price);
		return builder.toString();
	}
}