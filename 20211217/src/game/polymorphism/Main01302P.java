package game.polymorphism;

public class Main01302P {

	public static void main(String[] args) {
		// Commoner 생성
		Commoner c1 = new Commoner("초보");
		Monster o1 = new Orc();
		
		c1.hunt(o1);
		c1.hunt(o1);
		c1.hunt(o1);


	}

}
