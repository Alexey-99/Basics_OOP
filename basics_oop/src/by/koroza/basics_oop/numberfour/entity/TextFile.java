package by.koroza.basics_oop.numberfour.entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import by.koroza.basics_oop.numberfour.search.Search;

public class TextFile extends Search {
	private static final int MAX_NUMBER_TREASURE = 100;

	private Directoire directoire;
	private File file;

	public TextFile(Directoire directoire, File file) throws IOException {
		this.directoire = directoire;
		directoire.mkdirs();
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

	public void printToFile() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i <= MAX_NUMBER_TREASURE; i++) {
			TreasureDescription treasureDescription = new TreasureDescription();
			if (i < MAX_NUMBER_TREASURE) {
				pw.println(treasureDescription.toString());
			}
			if (i == MAX_NUMBER_TREASURE) {
				pw.print(treasureDescription.toString());
			}
		}
		pw.close();
	}
}