package by.koroza.basics_oop.numberone.variantone.entitiy;

import java.io.IOException;

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
			file.renameTo(new File(file.getParent() + "/" + newName));
		} else {
			directory.renameTo(new Directory(directory.getParent() + "/" + newName));
		}
	}

	public void printToConsole() { // TODO printToConsole()

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