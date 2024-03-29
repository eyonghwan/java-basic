package game.inheritance;

public class Commoner {
	protected int lv;
	protected int hp;
	protected int mp;
	protected String name;
	
	// 생성자는 레벨 1, 체력 20, 마나 10을 기본으로, 아이디는 입력받아 처리.
	public Commoner(String name) {
		// 생성자 내부에서 맴버변수를 초기화할때는 this.를 붙이는 경우가 많습니다.
		this.name = name;
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;
	}
	
	public void grtInfo() {
		System.out.println("현재 상태입니다.");
		System.out.println("이름 : " + name + ", 레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp);
	}

}
