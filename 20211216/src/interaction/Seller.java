package interaction;

public class Seller {
	// 변수로 int money(매출), int mango(재고)를 가집니다
	private int money; // 매출액
	private int mango; // 재고(개수)
	
	// 생성자에서 money는 초기값이 0이고, mango는 입력받도록 해주세요.
	public Seller(int mango) {
		money = 0;
		this.mango = mango;
	}
	
	// sellMango(int mango)를 이용해서 망고 개수를 입력받으면
	public void Sellmango(int mango) {
		// 망고가 모자라면 "망고가 모자랍니다"라고 하고 메서드를 종료합니다.
		if (this.mango < mango) {
			System.out.println("망고가 모자랍니다.");
			return; // 메서드 강제종료구문
		}
		// 자신의 this.mango는 갯수만큼 차감하고, this.money는 망고개수*가격 만큼 증가합니다.
		this.mango -= mango;
		this.money += mango * 4000;
	}
	
	public void showSeller() {
		System.out.println("Seller의 상태");
		System.out.println("현재 소지금 : " + money);
		System.out.println("망고개수 : " + mango);
	}

	public int getMango() {
		return mango;
	}

}
