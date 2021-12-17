package game.inheritance;

public class Archer extends Commoner{
	private int rDam;
	
	public Archer(String name) {
		super(name);
		this.rDam = 5;
	}
	
	public void getInfo() { 
	System.out.println("현재 상태입니다.");
	System.out.println("이름 : " + name + ", 레벨 : " + lv + 
			", 체력 : " + hp + ", 마나 : " + mp + 
			", 원거리데미지 : " + rDam);
	}

}
