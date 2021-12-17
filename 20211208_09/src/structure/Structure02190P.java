package structure;

public class Structure02190P {
	
	// person 내부의 정보를 쉽게 조회하기 위해 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
	}

	public static void main(String[] args) {
		// 사람 두 명을 만들어보세요(a, b)
		
		Person pa= new Person();
		
		pa.name = "에이씨";
		pa.age = 11;
		pa.pNum = "01011111111";
		pa.uNum = 11;
		
		Person pb = new Person();
		
		pb.name = "비씨";
		pb.age = 12;
		pb.pNum = "01022222222";
		pb.uNum =12;
		
		getInfo(pa);
		getInfo(pb);

	}

}
