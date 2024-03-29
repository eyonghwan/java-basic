package interaction;

public class Buyer {
	public int money;
	public int mango;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
	public void buyMango(Seller seller, int mango) {
		if (this.money < mango * 4000 ) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		else if (mango > seller.getMango()) {
			System.out.println("망고 재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		} else
		seller.Sellmango(mango);
		this.money -= mango * 4000;
		this.mango += mango;
	}
	
	public void showBuyer() {
		System.out.println("Buyer의 상태");
		System.out.println("소지 망고개수 : " + this.mango);
		System.out.println("소지금 : " + this.money);
	}

}
