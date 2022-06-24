package by.koroza.basics_oop.numberone.entities;

public class TextFile {
	private String nameFile;
	private StringBuilder content;
	private static final String NAME_FILE = "Name file: ";
	private static final String CONTENT = "Content: ";
	private static final String NEXT_LINE = "\n";

	public TextFile(String nameFile) {
		this.nameFile = nameFile;
		this.content = new StringBuilder();
	}

	public TextFile(String nameFile, String content) {
		this.nameFile = nameFile;
		this.content = new StringBuilder(content);
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public StringBuilder getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = new StringBuilder(content);
	}

	public void renameFile(String nameFile) {
		setNameFile(nameFile);
	}

	public void replenishContent(String content) {
		this.content.append(content);
	}

	public void printContent() {
		System.out.println(content);
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (nameFile != null ? nameFile.hashCode() : 1);
		result = result * prime + (content != null ? content.hashCode() : 1);
		result = result * prime + (NAME_FILE != null ? NAME_FILE.hashCode() : 1);
		result = result * prime + (CONTENT != null ? CONTENT.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
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
		TextFile textFile = (TextFile) object;
		if (nameFile == null) {
			if (textFile.nameFile != null) {
				return false;
			}
		} else if (!nameFile.equals(textFile.nameFile)) {
			return false;
		}
		if (content == null) {
			if (textFile.content != null) {
				return false;
			}
		} else if (!content.equals(textFile.content)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(NAME_FILE).append(nameFile).append(NEXT_LINE);
		builder.append(CONTENT).append(content).append(NEXT_LINE);
		return builder.toString();
	}
}