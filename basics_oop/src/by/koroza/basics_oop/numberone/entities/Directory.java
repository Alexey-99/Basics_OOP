package by.koroza.basics_oop.numberone.entities;

import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;

public class Directory {
	private TextFile[] files;

	public TextFile[] getFiles() {
		return files;
	}

	public void setFiles(TextFile[] files) {
		this.files = files;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (files != null ? files.hashCode() : 1);
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
		if (files == null) {
			if (directory.files != null) {
				return false;
			}
		} else if (!files.equals(directory.files)) {
			return false;
		}
		return true;
	}
}