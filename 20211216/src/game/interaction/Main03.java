package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Archer a1 = new Archer();
		Orc o1 = new Orc();
		Troll t1 = new Troll();
		
		a1.huntOrc(o1);
		a1.huntTroll(t1);
		
		Magician m1 = new Magician();
		Orc o2 = new Orc();
		Troll t2 = new Troll();
		
		m1.huntOrc(o2);
		m1.huntTroll(t2);

	}

}
