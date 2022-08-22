package by.koroza.basics_oop.numberfour.main;

import java.io.IOException;

public class TextFile {
	private Directoire directoire;
	private File file;

	public TextFile(Directoire directoire, File file) throws IOException {
		this.directoire = directoire;
		directoire.mkdir();
		this.file = file;
		file.createNewFile();
	}

	public Directoire getDirectoire() {
		return directoire;
	}

	public void setDirectoire(Directoire directoire) {
		this.directoire = directoire;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void delete() {
		file.delete();
		directoire.delete();
	}

	public void deleteFile() {
		file.delete();
	}
	
	public void deleteDirectoire() {
		directoire.delete();
	}
	
	

}