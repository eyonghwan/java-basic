package interaction;

public class Buyer {
	public int money;
	public int banana;
	public int apple;
	
	public Buyer(int money) {
		this.money = money;
		this.banana = 0;
		this.apple = 0;
	}
	
	public void buyBanana(Seller seller, int banana) {
		if (this.money < banana * 7000 ) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		else if (banana > seller.getBanana()) {
			System.out.println("바나나 재고가 부족합니다. 바나나 재고 : " + seller.getBanana());
			return;
		} else
		seller.sellBanana(banana);
		this.money -= banana * 7000;
		this.banana += banana;
		System.out.println("바나나를 " + banana + "개 구매했습니다.");
	}
	
	public void buyApple(Seller seller, int apple) {
		if (this.money < apple * 7000 ) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		else if (apple > seller.getApple()) {
			System.out.println("사과 재고가 부족합니다. 사과 재고 : " + seller.getApple());
			return;
		} else
			seller.sellApple(apple);
		this.money -= apple * 3000;
		this.apple += apple;
		System.out.println("사과를 " + apple + "개 구매했습니다.");
	}
	
	public void showBuyer() {
		System.out.println("Buyer의 상태");
		System.out.println("소지 바나나개수 : " + this.banana);
		System.out.println("소지 사과개수 : " + this.apple);
		System.out.println("소지금 : " + this.money);
	}

}
