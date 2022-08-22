package by.koroza.basics_oop.numberfour.main;

@SuppressWarnings("serial")
public class File extends java.io.File {

	public File(java.io.File parent, String child) {
		super(parent, child);
	}
	
	public File(String name) {
		super(name);
	}
}