package by.koroza.basics_oop.numberone.entities;

public class Directory {
	private String nameDirectory;
	private TextFile[] files;

	public Directory() {
		this.files = new TextFile[0];
	}

	public Directory(TextFile file) {
		this.files = new TextFile[1];
		this.files[0] = file;
	}

	public Directory(TextFile[] files) {
		this.files = files;
	}

	public String getNameDirectory() {
		return nameDirectory;
	}

	public void setNameDirectory(String nameDirectory) {
		this.nameDirectory = nameDirectory;
	}

	public TextFile[] getFiles() {
		return files;
	}

	public void setFiles(TextFile[] files) {
		this.files = files;
	}

	public void addFile(TextFile file) {
		TextFile[] filesNew = new TextFile[this.files.length + 1];
		for (int i = 0; i < filesNew.length; i++) {
			if (i < this.files.length) {
				filesNew[i] = files[i];
			} else if (i == this.files.length) {
				filesNew[i] = file;
			}
		}
		this.files = filesNew;
	}

	public void addFiles(TextFile[] files) {
		TextFile[] filesNew = new TextFile[this.files.length + files.length];
		for (int i = 0; i < filesNew.length; i++) {
			if (i < this.files.length) {
				filesNew[i] = files[i];
			} else if (i >= this.files.length) {
				filesNew[i] = files[i - this.files.length];
			}
		}
		this.files = filesNew;
	}

	public void renameDirectory(String nameDirectory) {
		setNameDirectory(nameDirectory);
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (files != null ? files.hashCode() : 1);
		result = result * prime + (nameDirectory != null ? nameDirectory.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Directory directory = (Directory) object;
		if (nameDirectory == null) {
			if (directory.nameDirectory != null) {
				return false;
			}
		} else if (!nameDirectory.equals(directory.nameDirectory)) {
			return false;
		}
		if (files == null) {
			if (directory.files != null) {
				return false;
			}
		} else if (!files.equals(directory.files)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name directory: ").append(nameDirectory).append("\n");
		if (this.files.length > 0) {
			for (TextFile file : files) {
				builder.append(file.toString());
			}
		} else {
			builder.append("Derectory doesn't have text file");
		}
		return builder.toString();
	}
}