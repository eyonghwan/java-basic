package game.inheritance;

public class Warrior extends Commoner{
	private int pDam;
	
	public Warrior(String name) {
		super(name);
		this.pDam = 2;
	}
	
	public void getInfo() { 
	System.out.println("현재 상태입니다.");
	System.out.println("이름 : " + name + ", 레벨 : " + lv + 
			", 체력 : " + hp + ", 마나 : " + mp + 
			", 물리데미지 : " + pDam);
	}
	
	

}
