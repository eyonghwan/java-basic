package game.polymorphism;

public class Troll extends Monster {
	
	public Troll() {
		// 부모인 Monster를 처리해야 하므로 super()를 이용합니다.
		super("트롤", 8, 1);
	}

}
