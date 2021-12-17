package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(4, 5);
		Buyer b1 = new Buyer(590000);
		
		b1.buyBanana(s1, 3);
		b1.buyApple(s1, 4);

	}

}
