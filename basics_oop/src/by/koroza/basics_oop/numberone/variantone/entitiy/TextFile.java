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