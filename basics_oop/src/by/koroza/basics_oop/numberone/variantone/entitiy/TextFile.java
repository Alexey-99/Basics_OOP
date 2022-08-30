package by.koroza.basics_oop.numberone.variantone.entitiy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
	private Directory directory;
	private File file;

	public TextFile(Directory directory, File file) throws IOException {
		this.directory = directory;
		this.directory.mkdirs();
		this.file = file;
		this.file.createNewFile();
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void create(String path) throws IOException {
		if (path.contains(".txt")) {
			file = new File(path);
			file.createNewFile();
		} else {
			directory = new Directory(path);
			directory.mkdirs();
		}
	}

	public void rename(String newName) {
		if (newName.contains(".txt")) {
			File fileNewName = new File(file.getParent() + "/" + newName);
			if (file.exists() == true) {
				if (file.renameTo(fileNewName) == true) {
					file = fileNewName;
				}
			}
		} else {
			Directory directoryNewName = new Directory(directory.getParent() + "/" + newName);
			if (directory.exists() == true) {
				if (directory.renameTo(directoryNewName) == true) {
					directory = directoryNewName;
				}
			}

		}
	}

	public void printToConsole() throws FileNotFoundException {
		String line = "";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			line = scan.nextLine();
			System.out.println(line);
		}
	}

	public void addText() { // TODO addText()

	}

	public void delete() {
		directory.delete();
		file.delete();
	}

	public void deleteFile() {
		file.delete();
	}

	public void deleteDirectory() {
		directory.delete();
	}
}