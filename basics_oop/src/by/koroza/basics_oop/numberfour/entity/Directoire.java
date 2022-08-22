package by.koroza.basics_oop.numberfour.entity;

@SuppressWarnings("serial")
public class Directoire extends File {
	
	public Directoire(String name) {
		super(name);
	}
	
	public Directoire(java.io.File parent, String name) {
		super(parent, name);
	}

}
