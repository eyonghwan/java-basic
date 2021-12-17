package game.interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Archer() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.def = 1;
		this.exp = 0;
	}
	
	public void huntOrc(Orc orc) {
		orc.doBattle(this.atk);
		this.hp = this.hp + this.def - orc.getAtk();
		System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	}
	
	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk);
		if ((troll.getHp()) <= 0 ) {
			System.out.println("트롤을 사냥했습니다.");
			return;
		} else {
		this.hp = this.hp + this.def - troll.getAtk();
		System.out.println("교전 결과 궁수의 체력 : " + this.hp);
		}
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	

}
