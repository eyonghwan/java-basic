package polymorphism;

public class Main01302P {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을 수 있음.
		Person p1 = new Person("사람", 10);
		Person s1 = new Student("학생", 9, 100);
		
		// p1과 s1의 showPeron은 다르게 돌아갑니다.
		p1.showPerson(); // Person 측 showPerson() 호출
		s1.showPerson(); // Student 측 showPerson() 호출
		
		// 신분밝히기용 showStudent()를 호출시도해보세요.

	}

}
