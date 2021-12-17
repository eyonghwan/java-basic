package game.inheritance;

public class Magician extends Commoner{
	private int mDam;
	
	public Magician(String name) {
		super(name);
		this.mDam = 5;
	}
	
	public void getInfo() { 
	System.out.println("현재 상태입니다.");
	System.out.println("이름 : " + name + ", 레벨 : " + lv + 
			", 체력 : " + hp + ", 마나 : " + mp + 
			", 마법데미지 : " + mDam);
	}

}
