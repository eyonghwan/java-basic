package game.inheritance;

public class Main03 {

	public static void main(String[] args) {
		// 마법사를 생성해보세요.
		Magician m1 = new Magician("마법사");
		
		// 정보 조회를 해보시고, 호출순번도 고려해보세요.
		m1.getInfo();
		
		Archer a1 = new Archer("궁수");
		
		// 정보 조회를 해보시고, 호출순번도 고려해보세요.
		a1.getInfo();

	}

}
