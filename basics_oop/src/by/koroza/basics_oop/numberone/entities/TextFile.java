package by.koroza.basics_oop.numberone.entities;

public class TextFile {
	private String nameFile;
	private String content;

	public TextFile() {

	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (nameFile != null ? nameFile.hashCode() : 1);
		result = result * prime + (content != null ? content.hashCode() : 1);
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
		return builder.toString();
	}
}