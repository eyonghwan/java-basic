package game.polymorphism;

public class Commoner {
	// 속성(필드, 변수)값으로 name, hp, mp, atk
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	// 생성자로 위 필드를초기화하도록 설정해주세요.
	
	public Commoner(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
	}
	
	// 다형성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함.
	public void hunt(Monster monster) {
		// 몬스터의 dobattle(사용자공격력)을 호출해서 몬스터의 체력을 깎아주세요.
		System.out.println(this.name + "이/가 " + this.atk + "의 피해를 입혔습니다.");
		monster.doBattle(this.atk);
		if (monster.getHp() < 0) {
			return;
		}
		this.hp -= monster.getAtk();
		if (this.hp <= 0) {
			System.out.println(this.name + "이/가 죽었습니다.");
			return;
		}
		System.out.println("교전 결과 " + this.name + "의 체력 : " + this.hp);
	}

}
