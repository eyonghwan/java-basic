package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(50);
		
		Buyer b1 = new Buyer(5000000);
		
		b1.buyMango(s1, 10);
		b1.showBuyer();
		s1.showSeller();
	}

}
