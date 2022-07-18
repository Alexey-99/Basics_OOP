package by.koroza.basics_oop.numbertwo.varianttwo.main;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();

        payment.addProduct("product1", 1.2);
        payment.addProduct("product2", 1.2);
        payment.addProduct("product3", 4);

        payment.showProducts();
	}
}