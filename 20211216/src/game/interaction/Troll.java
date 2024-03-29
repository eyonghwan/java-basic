package game.interaction;

public class Troll {
	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		this.hp = 7;
		this.atk = 2;
		this.def = 0;
	}
	
	public void doBattle(int uAtk) {
		if ((this.hp - uAtk) <= 0) {
			this.hp = 0;
			return;
		} else {
		this.hp = (this.hp + this.def) - uAtk;
		System.out.println("트롤의 남은 체력 : " + this.hp);
		}
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

}
