package structure;

public class ClassMain01196P {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		PersonClass man = new PersonClass();
		man.name = "박혁거세";
		man.age = 20;
		man.pNum = "01023442234";
		man.uNum = 23;
		man.sex = "남자";
		
		PersonClass woman = new PersonClass();
		woman.name = "선덕여왕";
		woman.age = 29;
		woman.pNum = "01059582736";
		woman.uNum = 24;
		woman.sex = "여자";
		
		man.getInfo();
		woman.getInfo();

	}

}
