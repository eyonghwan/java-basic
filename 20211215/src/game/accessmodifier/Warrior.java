package game.accessmodifier;

public class Warrior extends Commoner{
	
	public Warrior(String name) {
		super(name);
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp() - 1);
		setExp(getExp() + 10);
	}
	
	public void doubleAttack() {
		System.out.println("DOUBLEATTACK을 사용했습니다.");
		if (getHp() - 4 >= 0) {
		setHp(getHp() - 4);
		setExp(getExp() + 25);
		} else {
			System.out.println("DOUBLEATTACK을 사용할 체력이 부족합니다.");
		}
	}
	
	public void getInfo() {
		System.out.println("현재 체력 : " + getHp());
		System.out.println("이름 : " + getName() + ", 마나 : " + getMp() + ", 레벨 : " + getLv() + ", 현재 경험치 : " + getExp());
	}

}
