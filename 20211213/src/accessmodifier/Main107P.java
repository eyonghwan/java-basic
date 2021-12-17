package accessmodifier;

public class Main107P {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		Warrior baba = new Warrior("야만");
		// private 요소 hp는 main지역에서 직접 값 못 바꿈.
		baba.hunt();
		baba.hunt();
		baba.hunt();

	}

}
