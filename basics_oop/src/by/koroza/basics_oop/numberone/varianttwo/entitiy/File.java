package by.koroza.basics_oop.numberone.varianttwo.entitiy;

@SuppressWarnings("serial")
public class File extends java.io.File {
	public File(String pathname) {
		super(pathname);
	}

	public File(String parent, String child) {
		super(parent, child);
	}

	public File(java.io.File parent, String child) {
		super(parent, child);
	}
}