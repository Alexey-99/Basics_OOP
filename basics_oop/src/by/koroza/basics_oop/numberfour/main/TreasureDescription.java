package by.koroza.basics_oop.numberfour.main;

import java.util.Random;

public class TreasureDescription {
	private static int count = 0;
	private static final String DEFAULT_NAME = "Treasure";
	private static final int MAX_PRICE = 1000;
	
	private int number;
	private String name;
	private int price;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	private int decarationPrice() {
		int price = 0;
		Random rand = new Random();
		price = rand.nextInt(MAX_PRICE);
		return price;
	}

	
}
