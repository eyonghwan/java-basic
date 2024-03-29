package interaction;

public class Seller {
	private int money;
	private int banana;
	private int apple;
	
	public Seller(int banana, int apple) {
		money = 0;
		this.banana = banana;
		this.apple = apple;
	}
	
	public void sellBanana(int banana) {
		if (this.banana < banana) {
			System.out.println("바나나가 모자랍니다.");
			return; // 메서드 강제종료구문
		}
		// 자신의 this.mango는 갯수만큼 차감하고, this.money는 망고개수*가격 만큼 증가합니다.
		this.banana -= banana;
		this.money += banana * 7000;
	}
	
	public void sellApple(int apple) {
		if (this.apple < apple) {
			System.out.println("사과가 모자랍니다.");
			return; // 메서드 강제종료구문
		}
		// 자신의 this.mango는 갯수만큼 차감하고, this.money는 망고개수*가격 만큼 증가합니다.
		this.apple -= apple;
		this.money += apple * 3000;
	}
	
	public void showSeller() {
		System.out.println("Seller의 상태");
		System.out.println("현재 소지금 : " + money);
		System.out.println("바나나의 개수 : " + this.banana);
		System.out.println("사과의 개수 : " + this.apple);
	}

	public int getBanana() {
		return this.banana;
	}
	
	public int getApple() {
		return this.apple;
	}


}
