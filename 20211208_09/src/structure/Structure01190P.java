package structure;

public class Structure01190P {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// p1 내부에 정의한 변수를 
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "이용환";
		System.out.println(p1.name);
		p1.age = 25;
		System.out.println(p1.age);
		p1.pNum = "01012314123";
		System.out.println(p1.pNum);
		p1.uNum = 22;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어봅니다.
		Person p2 = new Person();
		// p2에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요
		
		p2.name = "박박박";
		p2.age = 18;
		p2.pNum = "01098263846";
		p2.uNum = 55;
	}

}
