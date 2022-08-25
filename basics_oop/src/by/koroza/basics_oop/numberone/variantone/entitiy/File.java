package by.koroza.basics_oop.numberone.variantone.entitiy;

@SuppressWarnings("serial")
public class File extends java.io.File {

	public File(java.io.File parent, String child) {
		super(parent, child);
	}

	public File(String child) {
		super(child);
	}
}
