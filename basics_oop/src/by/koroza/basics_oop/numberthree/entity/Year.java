package by.koroza.basics_oop.numberthree.entity;

public class Year {
	private int number;
	private Month[] month;

	public Year(int number) {
		this.number = number;
		this.month = new Month[0];
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Month[] getMonth() {
		return month;
	}

	public void setMonth(Month[] month) {
		this.month = month;
	}

}