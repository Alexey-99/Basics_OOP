package by.koroza.basics_oop.numberone.variantone.entitiy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
	private Directory directory;
	private File file;

	private static final String MESSAGE_FILE_EMPTY = "This text file is empty.";

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
			this.file = new File(path);
			this.file.createNewFile();
		} else {
			this.directory = new Directory(path);
			this.directory.mkdirs();
		}
	}

	public void create(java.io.File parent, String child) throws IOException {
		if (child.contains(".txt")) {
			this.file = new File(parent, child);
			this.file.createNewFile();
		} else {
			this.directory = new Directory(parent, child);
			this.directory.mkdirs();
		}
	}

	public void rename(String newName) {
		if (newName.contains(".txt")) {
			String str = this.file.getParent();
			File fileNewName = new File(this.directory.getParent() + "/" + newName);
			if (this.file.exists() == true) {
				if (this.file.renameTo(fileNewName) == true) {
					this.file = fileNewName;
				}
			}
		} else {
			Directory directoryNewName = new Directory(this.directory.getParent() + "/" + newName);
			if (this.directory.exists() == true) {
				if (this.directory.renameTo(directoryNewName) == true) {
					this.directory = directoryNewName;
				}
			}

		}
	}

	public void printToConsole() throws FileNotFoundException {
		int countLine = 0;
		String line = "";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(this.file);
		while (scan.hasNext()) {
			line = scan.nextLine();
			System.out.println(line);
			countLine++;
		}
		if (countLine == 0) {
			System.out.println(MESSAGE_FILE_EMPTY);
		}
	}

	public void addText() { // TODO addText()

	}

	public void delete() {
		this.directory.delete();
		this.file.delete();
	}

	public void deleteFile() {
		this.file.delete();
	}

	public void deleteDirectory() {
		this.directory.delete();
	}
}