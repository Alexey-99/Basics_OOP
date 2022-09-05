package by.koroza.basics_oop.numberone.entity;

@SuppressWarnings("serial")
public class Directory extends File {

	public Directory(java.io.File parent, String child) {
		super(parent, child);
	}
	
	public Directory(String child) {
		super(child);
	}
}