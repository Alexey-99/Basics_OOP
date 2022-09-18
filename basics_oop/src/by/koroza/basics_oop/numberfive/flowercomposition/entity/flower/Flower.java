package by.koroza.basics_oop.numberfive.flowercomposition.entity.flower;

public class Flower {
	private String groupName;
	private String name;
	private double price;
	private static final String LINE_GROUP_FLOWER = "Group of flower: ";
	private static final String LINE_NAME = "Name: ";
	private static final String LINE_PRICE = "Price: ";
	private static final String OPERATION_NEXT_LINE = "\n";

	public Flower(String groupName, String name, double price) {
		this.groupName = groupName;
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

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public int hashCode() {
		final int prime = 1;
		int result = 31;
		result = result * prime + (groupName != null ? groupName.hashCode() : 1);
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + Double.hashCode(price);
		result = result * prime + (LINE_NAME != null ? LINE_NAME.hashCode() : 1);
		result = result * prime + (LINE_PRICE != null ? LINE_PRICE.hashCode() : 1);
		result = result * prime + (LINE_GROUP_FLOWER != null ? LINE_GROUP_FLOWER.hashCode() : 1);
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
		Flower flower = (Flower) object;
		if (groupName == null) {
			if (flower.groupName != null) {
				return false;
			}
		} else if (!groupName.equals(flower.groupName)) {
			return false;
		}
		if (name == null) {
			if (flower.name != null) {
				return false;
			}
		} else if (!name.equals(flower.name)) {
			return false;
		}
		if (price != flower.price) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(LINE_GROUP_FLOWER).append(groupName).append(OPERATION_NEXT_LINE);
		builder.append(LINE_NAME).append(name).append(OPERATION_NEXT_LINE);
		builder.append(LINE_PRICE).append(price);
		return builder.toString();
	}
}